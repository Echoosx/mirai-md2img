package org.echoosx.mirai.plugin


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.contact.Contact.Companion.sendImage
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.event.subscribeMessages
import net.mamoe.mirai.utils.info
import org.echoosx.mirai.plugin.utils.DrawMarkdown
import org.echoosx.mirai.plugin.utils.touchDir


object MarkdownToImage : KotlinPlugin(
    JvmPluginDescription(
        id = "org.echoosx.mirai.plugin.mirai-md2img",
        name = "mirai-md2img",
        version = "0.1.0"
    ) {
        author("Echoosx")
        dependsOn("xyz.cssxsh.mirai.plugin.mirai-selenium-plugin", true)
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
        //配置文件目录 "${dataFolder.absolutePath}/"

        touchDir("${dataFolderPath}/html")
        touchDir("${dataFolderPath}/image")

        val eventChannel = GlobalEventChannel.parentScope(this)
        eventChannel.subscribeMessages {
            startsWith("md"){ str->
                try {
                    val drawer = DrawMarkdown()
                    drawer.setLight(false)
//                    val resource = drawer.markdown2Image(FileInputStream("${dataFolderPath}/help.md"))
                    val resource = drawer.markdown2Image(str)
                    subject.sendImage(resource)
                    withContext(Dispatchers.IO) {
                        resource.close()
                    }

                }catch (e:Throwable){
                    subject.sendMessage("生成失败")
                    logger.error(e)
                }
            }
        }
    }
}
