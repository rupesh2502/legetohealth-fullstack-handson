package com.leagtohealth.configuration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FIRSTAPP/myFirstApp")
public interface Client {
    
	@GetMapping(path ="/home")
	public String invokFirstApp();
}
