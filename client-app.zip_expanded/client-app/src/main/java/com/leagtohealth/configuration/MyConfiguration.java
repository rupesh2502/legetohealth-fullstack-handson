package com.leagtohealth.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfiguration {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();		
	}

}
