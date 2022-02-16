package com.leagtohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.leagtohealth.configuration.Client;

@RestController
@RequestMapping("myClientApp")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Client client;
	
    @GetMapping
	public ResponseEntity<String> home(){
		return ResponseEntity.status(HttpStatus.OK).body("Client App !!!");
	}
	
	@GetMapping("/getFirstApp")
	public ResponseEntity<String> getFirstApp(){
		String url = "http://FIRSTAPP/myFirstApp/home";
		String response = restTemplate.getForObject(url, String.class);
		return ResponseEntity.status(HttpStatus.OK).body("Callling FirstApp from Client "+response);
	}
	
	@GetMapping("/getFirstApp-feign")
	public ResponseEntity<String> getFirstAppFeign(){
		String response = client.invokFirstApp();
		return ResponseEntity.status(HttpStatus.OK).body("Callling FirstApp from Client-FeignClient "+response);
	}

}
