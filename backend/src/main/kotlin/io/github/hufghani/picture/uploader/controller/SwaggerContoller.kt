package io.github.hufghani.picture.uploader.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SwaggerContoller {

    @GetMapping("/api-docs")
    fun swagger() : String =  "redirect:/swagger-ui.html"

}
