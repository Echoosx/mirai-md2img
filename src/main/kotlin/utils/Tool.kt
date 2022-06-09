package org.echoosx.mirai.plugin.utils

import org.echoosx.mirai.plugin.MarkdownToImage
import java.io.File

internal val logger get() = MarkdownToImage.logger
// 如不存在则创建目录
fun touchDir(dirPath: String): Boolean {
    var destDirName = dirPath
    val dir = File(destDirName)
    if (dir.exists()) {
        return false
    }
    if (!destDirName.endsWith(File.separator)) {
        destDirName += File.separator
    }
    //创建目录
    return if (dir.mkdirs()) {
        true
    } else {
        logger.error("创建目录" + destDirName + "失败！")
        false
    }
}