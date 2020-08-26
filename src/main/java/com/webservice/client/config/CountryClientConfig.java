package com.webservice.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.webservice.client.service.CountryClientService;

@Configuration
public class CountryClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("com.webservice.client.gen");
            return marshaller;
    }

    @Bean
    public CountryClientService countryClient(Jaxb2Marshaller marshaller) {
            CountryClientService client = new CountryClientService();
            client.setDefaultUri("http://172.17.0.2/ws");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            return client;
    }
}
