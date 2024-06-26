package com.sfs.image.mgmt.config;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class AppConfig {

	@Bean
	  public RestTemplate restTemplate() {
	        return new RestTemplate();
	  }
	
	 @Bean
	  public GroupedOpenApi publicApi() {
	        return GroupedOpenApi.builder()
	                .group("public")
	                .pathsToMatch("/sfs/users/**", "/sfs/images/**") 
	                .build();
	    }

	 
}
