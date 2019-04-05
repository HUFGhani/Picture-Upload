package io.github.hufghani.picture.uploader.controller

import io.github.hufghani.picture.uploader.model.Picture
import io.github.hufghani.picture.uploader.service.PicutreUploadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
class PictureUploaderController @Autowired constructor(
        private val picutreUploadService: PicutreUploadService
) {
    @GetMapping("/api/hello", produces = ["application/json"])
    fun example(): Picture{
        return picutreUploadService.uploadPicture()
    }

}
