package io.github.hufghani.picture.uploader.model

import io.github.hufghani.picture.uploader.PictureUploaderApplication

data class Picture (val id: Int,
                    val pictureName : String,
                    val picture : String,
                    val dateOfUploaded : Long,
                    val dateOfCreation : Long)
