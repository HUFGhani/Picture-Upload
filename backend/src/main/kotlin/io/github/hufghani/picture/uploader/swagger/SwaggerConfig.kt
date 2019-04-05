package io.github.hufghani.picture.uploader.swagger

import com.google.common.base.Predicates
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_12)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(Predicates.and(
                    Predicates.not(PathSelectors.regex("/error")),
                    Predicates.not(PathSelectors.regex("/actuator.*")),
                    Predicates.not(PathSelectors.regex("/api-docs"))))
            .build()
            .apiInfo(getApiInfo())

    private fun getApiInfo(): ApiInfo? {
        return ApiInfoBuilder()
                .title("Picture uploader")
                .version("1.0.0")
                .build()
    }

}
