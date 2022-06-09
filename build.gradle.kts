plugins {
    val kotlinVersion = "1.6.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.11.0"
}

group = "org.echoosx"
version = "0.1.0"

repositories {
    mavenCentral()
    maven("https://maven.aliyun.com/repository/public") // 阿里云国内代理仓库
    maven("https://raw.githubusercontent.com/liuyueyi/maven-repository/master/repository")

}

dependencies{
    implementation("com.vladsch.flexmark:flexmark:0.64.0")
    implementation("com.vladsch.flexmark:flexmark-util:0.64.0")
    implementation("com.vladsch.flexmark:flexmark-ext-tables:0.64.0")

    implementation("com.github.liuyueyi.media:base-plugin:2.6.3")
    implementation("com.github.liuyueyi.media:markdown-plugin:2.6.3")
    implementation("org.xhtmlrenderer:core-renderer:R8")

    implementation("org.seleniumhq.selenium:selenium-java:4.1.4")
    implementation("com.assertthat:selenium-shutterbug:1.6")

    compileOnly("xyz.cssxsh.mirai:mirai-selenium-plugin:2.1.0")
    testImplementation("xyz.cssxsh.mirai:mirai-selenium-plugin:2.1.0")
    testImplementation(kotlin("test"))
}