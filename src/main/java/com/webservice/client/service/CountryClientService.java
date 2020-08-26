package com.webservice.client.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.webservice.client.gen.GetCountryRequest;
import com.webservice.client.gen.GetCountryResponse;

public class CountryClientService extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(CountryClientService.class);

    public GetCountryResponse getCountry(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        logger.info("Requesting information for " + country);
        logger.info(getWebServiceTemplate().getDefaultUri());
        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }

}
