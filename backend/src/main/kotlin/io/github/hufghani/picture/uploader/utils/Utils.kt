package io.github.hufghani.picture.uploader.utils

import java.io.File
import java.util.*


object Utils {
    fun encoder(filePath: String): String {
        val bytes = File(filePath).readBytes()
        val base64 = Base64.getEncoder().encodeToString(bytes)
        return base64
    }

    fun decoder(base64Str: String, pathFile: String): Unit{
        val imageByteArray = Base64.getDecoder().decode(base64Str)
        File(pathFile).writeBytes(imageByteArray)
    }

}
