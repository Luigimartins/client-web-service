package com.webservice.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class TesteConfig {
	
	@Value("${teste}")
	private Resource teste;
	
	public String getPath() {
		
		try {
			return teste.getURL().getPath();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}
}
