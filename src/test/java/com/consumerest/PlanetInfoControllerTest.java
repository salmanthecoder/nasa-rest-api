package com.consumerest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
public class PlanetInfoControllerTest {

    @Mock
    private PlanetInfoService planetInfoService;

    @InjectMocks
    private PlanetInfoController planetInfoController;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getPlanetDetails() throws Exception {

        PlanetDetails planetDetails = new PlanetDetails();
        planetDetails.setTitle("Mars");
        planetDetails.setExplanation("Hello");

        Mockito.when(planetInfoService.getPlanetDetalis()).thenReturn(planetDetails);
        PlanetDetails mockAllPlanetDetails = planetInfoController.getPlanetDetails();
        Assert.assertEquals(planetDetails.getExplanation(), "Hello");
        Assert.assertEquals(planetDetails.getTitle(), "Mars");

    }
}