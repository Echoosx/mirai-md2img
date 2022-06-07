package org.echoosx.mirai.plugin

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.utils.info

object MarkdownToImage : KotlinPlugin(
    JvmPluginDescription(
        id = "org.echoosx.mirai.plugin.mirai-md2img",
        name = "mirai-md2img",
        version = "0.1.0"
    ) {
        author("Echoosx")
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
        //配置文件目录 "${dataFolder.absolutePath}/"
        val eventChannel = GlobalEventChannel.parentScope(this)

    }
}
