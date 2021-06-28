package com.railway.ReserveTicketsService.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class TicketSwagger {
	@Bean
	public Docket swaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.any())
		.paths(PathSelectors.any())
		.build()
		.apiInfo(appInformation());
		
}
	
	private ApiInfo appInformation() {
		return new ApiInfo(
				"Swagger API for Reservation",
				"Private API",
				"Using Spring Boot Version",
				"2.5.0",
				new Contact("Rupsa Sarkar","Rupsasonai98@gmail.com","6291210678"),
				"Reservation",
				"Swagger",
				Collections.emptyList()
				);
	}
	


}
