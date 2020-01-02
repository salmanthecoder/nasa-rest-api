package com.consumerest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlanetInfoController{
    @Autowired
    private PlanetInfoService planetInfoService;
    @CrossOrigin
    @RequestMapping("/planet/info")
    public PlanetDetails getPlanetDetails() throws Exception {
        return planetInfoService.getPlanetDetalis();
    }
}
