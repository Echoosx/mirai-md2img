package org.echoosx.mirai.plugin

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.ValueName
import net.mamoe.mirai.console.data.value
import xyz.cssxsh.selenium.RemoteWebDriverConfig
import xyz.cssxsh.selenium.UserAgents

object MiraiSeleniumConfig:AutoSavePluginConfig("SeleniumConfig"),RemoteWebDriverConfig {
   @ValueName("user_agent")
    @ValueDescription("截图UA")
    override val userAgent: String by value(UserAgents.IPAD)

    @ValueName("width")
    @ValueDescription("截图宽度")
    override val width: Int by value(1920)

    @ValueName("height")
    @ValueDescription("截图高度")
    override val height: Int by value(1080)

    @ValueName("headless")
    @ValueDescription("无头模式（后台模式）")
    override val headless: Boolean by value(true)

    @ValueName("proxy")
    @ValueDescription("代理地址")
    override val proxy: String by value("")

    @ValueName("preferences")
    @ValueDescription("User Preferences")
    override val preferences: Map<String, String> by value()

    @ValueName("log")
    @ValueDescription("启用日志文件")
    override val log: Boolean by value(false)

    @ValueName("browser")
    @ValueDescription("指定使用的浏览器，Chrome/Chromium/Firefox/Edge")
    override val browser: String by value("")

    @ValueName("factory")
    @ValueDescription("指定使用的Factory")
    override val factory: String by value("netty")

    @ValueName("arguments")
    @ValueDescription("自定义 arguments")
    override val arguments: List<String> by value()
}