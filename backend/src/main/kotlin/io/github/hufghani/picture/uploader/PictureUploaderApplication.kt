package io.github.hufghani.picture.uploader

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PictureUploaderApplication

fun main(args: Array<String>) {
	runApplication<PictureUploaderApplication>(*args)
}
