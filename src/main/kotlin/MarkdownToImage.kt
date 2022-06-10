package org.echoosx.mirai.plugin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.contact.Contact.Companion.sendImage
import net.mamoe.mirai.event.globalEventChannel
import net.mamoe.mirai.event.subscribeGroupMessages
import net.mamoe.mirai.utils.ExternalResource.Companion.toExternalResource
import net.mamoe.mirai.utils.info
import net.mamoe.mirai.utils.warning
import org.echoosx.mirai.plugin.utils.DrawMarkdown
import org.echoosx.mirai.plugin.utils.touchDir
import xyz.cssxsh.mirai.selenium.MiraiSeleniumPlugin

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
    private val selenium: Boolean by lazy {
        try {
            MiraiSeleniumPlugin.setup()
        } catch (exception: NoClassDefFoundError) {
            logger.warning { "相关类加载失败，请安装 https://github.com/cssxsh/mirai-selenium-plugin $exception" }
            false
        }
    }

    override fun onEnable() {
        logger.info { "Plugin loaded" }
        //配置文件目录 "${dataFolder.absolutePath}/"

        touchDir("${dataFolderPath}/html")
        touchDir("${dataFolderPath}/image")
        if(selenium) { MiraiSeleniumConfig.reload() }
        globalEventChannel().subscribeGroupMessages {
            startsWith("md"){ str->
                val drawer = DrawMarkdown()
                drawer.setLight(false)
                drawer.setWidth(800)
                drawer.setFontsize(25)
                val resource = drawer.markdown2Image(str).toExternalResource()
                subject.sendImage(resource)
                withContext(Dispatchers.IO) {
                    resource.close()
                }
            }
        }
    }
}
