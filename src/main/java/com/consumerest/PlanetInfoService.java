package com.consumerest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlanetInfoService {

@Autowired
private RestTemplate restTemplate;
    @Bean
    public PlanetDetails getPlanetDetalis() throws Exception {

        PlanetDetails planetDetails = restTemplate.getForObject(
                "https://api.nasa.gov/planetary/apod?api_key=N8L546fvQOpfWDb2aUPDFlQouZVaZCxlb5tZ08eo", PlanetDetails.class);
        return planetDetails;
    }
}
