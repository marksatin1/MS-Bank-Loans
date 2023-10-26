package com.eazybytes.loans;

import com.eazybytes.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@OpenAPIDefinition(
		info=@Info(
				title="Loans MS API Docs",
				description="REST API Documentation for the Loans microservice in a personal banking application",
				version="v1",
				contact=@Contact(
						name="Mark Satin",
						email="mark@fakemail.com",
						url="fake-website.com"
				),
				license=@License(
						name="Apache 2.0",
						url="fake-website.com"
				)
		),
		externalDocs=@ExternalDocumentation(
				description="REST API Documentation for the Loans microservice in a Personal Banking Application",
				url="fake-website.com"
		)
)
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@SpringBootApplication
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
