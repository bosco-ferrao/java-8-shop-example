package com.example.app.factory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.Before;
import org.junit.Test;

import com.example.app.service.SameCostOfferService;

public class OfferServiceFactoryTest {

    private SameCostOfferServiceFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new SameCostOfferServiceFactory();
    }

    @Test
    public void shouldObtainForOrangeService() throws Exception {
        //given

        //when

        //then
        assertThat(factory.offerFor("Orange"), instanceOf(SameCostOfferService.class));
    }


    @Test
    public void shouldObtainForAppleService() throws Exception {
        //given

        //when

        //then
        assertThat(factory.offerFor("Apple"), instanceOf(SameCostOfferService.class));
    }
}