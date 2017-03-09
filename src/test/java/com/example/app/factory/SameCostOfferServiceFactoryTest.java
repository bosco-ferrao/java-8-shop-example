package com.example.app.factory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.Before;
import org.junit.Test;

import com.example.app.service.Buy1Get1OfferService;
import com.example.app.service.Buy3For2OfferService;

public class SameCostOfferServiceFactoryTest {

    private OfferServiceFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new OfferServiceFactory();
    }

    @Test
    public void shouldObtainBuy3For2OfferService() throws Exception {
        //given

        //when

        //then
        assertThat(factory.offerFor("Orange"), instanceOf(Buy3For2OfferService.class));
    }


    @Test
    public void shouldObtainBuy1Get1OfferService() throws Exception {
        //given

        //when

        //then
        assertThat(factory.offerFor("Apple"), instanceOf(Buy1Get1OfferService.class));
    }
}