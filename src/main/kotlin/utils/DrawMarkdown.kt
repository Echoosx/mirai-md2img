package org.echoosx.mirai.plugin.utils

import com.assertthat.selenium_shutterbug.core.Capture
import com.assertthat.selenium_shutterbug.core.Shutterbug
import md2img.MarkDown2HtmlWrapper
import org.echoosx.mirai.plugin.MarkdownToImage.dataFolderPath
import org.openqa.selenium.By
import xyz.cssxsh.mirai.selenium.MiraiSeleniumPlugin
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@Suppress("duplicates","SpellCheckingInspection")
class DrawMarkdown {
    private var customCss:String = ""
    private var fontsize:Int = 20
    private var isLight:Boolean = true

    /**
     * 自定义css
     * @param customCss 用户自定义的css样式
     */
    fun setCss(customCss:String){
        this.customCss = customCss
    }

    /**
     * 自定义字体大小（默认20px,自定义css状态下无效）
     * @param fontsize 用户自定义字体大小
     */
    fun setFontsize(fontsize:Int){
        this.fontsize = fontsize
    }

    /**
     * 设置采用明亮模式还是黑暗模式（默认为明亮模式）
     * @param isLight true为明亮模式 false为黑暗模式
     */
    fun setLight(isLight:Boolean){
        this.isLight = isLight
    }

    /**
     * markdown转图片
     * @param markdown md文本，String类型
     * @return 图片的InputStream类型
     */
    fun markdown2Image(markdown:String):InputStream{
        val id = timestamp()
        val entity = MarkDown2HtmlWrapper.ofContent(markdown)
        if(this.customCss.isBlank())
            entity.css = MarkdownStyle().getCss(this.fontsize,this.isLight)
        else
            entity.css = this.customCss
        val fos = FileOutputStream("${dataFolderPath}/html/${id}.html", false)

        fos.write(entity.toString().toByteArray())
        fos.close()

        val driver = MiraiSeleniumPlugin.driver()
        driver.get("file://${dataFolderPath}/html/${id}.html")
        driver.manage().window().maximize()
        val size = driver.findElement(By.cssSelector("body")).size
        println(size)
        Shutterbug.shootPage(driver, Capture.FULL, true).withName(id).save("${dataFolderPath}/image")
        driver.quit()

        return FileInputStream("${dataFolderPath}/image/${id}.png")
    }

    /**
     * markdown转图片
     * @param markdownInput md文本输入流，InputStram类型
     * @return 图片的InputStream类型
     */
    fun markdown2Image(markdownInput:InputStream):InputStream{
        val id = timestamp()
        val entity = MarkDown2HtmlWrapper.ofStream(markdownInput)
        if(this.customCss.isBlank())
            entity.css = MarkdownStyle().getCss(this.fontsize,this.isLight)
        else
            entity.css = this.customCss
        val fos = FileOutputStream("${dataFolderPath}/html/${id}.html", false)

        fos.write(entity.toString().toByteArray())
        fos.close()

        val driver = MiraiSeleniumPlugin.driver()
        driver.get("file://${dataFolderPath}/html/${id}.html")
        driver.manage().window().maximize()
        val size = driver.findElement(By.cssSelector("body")).size
        println(size)

        Shutterbug.shootPage(driver, Capture.FULL, true).withName(id).save("${dataFolderPath}/image")
        driver.quit()

        return FileInputStream("${dataFolderPath}/image/${id}.png")
    }

    private fun timestamp():String{
        val timecode = DateTimeFormatter.ofPattern("yyyymmddhhmmss").format(LocalDateTime.now())
        val salt = createRandomStr(8)
        return "${timecode}_${salt}"
    }

    private fun createRandomStr(length: Int): String {
        val str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        val random = Random()
        val stringBuffer = StringBuffer()
        for (i in 0 until length) {
            val number = random.nextInt(62)
            stringBuffer.append(str[number])
        }
        return stringBuffer.toString()
    }
}