package io.github.hufghani.picture.uploader.service

import org.springframework.stereotype.Service

@Service
class ExampleService{
    data class ExampleResponse(val message: String)
    fun getSomeValue() = ExampleResponse("Hello Service!")
}
