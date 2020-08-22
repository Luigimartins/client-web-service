package com.webservice.client.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.client.config.TesteConfig;
import com.webservice.client.gen.GetCountryResponse;
import com.webservice.client.service.CountryClientService;

@RestController
@RequestMapping("v1/test-soap")
public class TesteResource {
	
	@Autowired
	private CountryClientService service;
	
	@Autowired
	private TesteConfig config;
	
	@GetMapping
	public ResponseEntity<GetCountryResponse> teste() {
		return ResponseEntity.ok(service.getCountry("Spain"));
		
	}
	
	@GetMapping("teste")
	public ResponseEntity<String>  testee() {
		return ResponseEntity.ok(config.getPath());
	}
}
