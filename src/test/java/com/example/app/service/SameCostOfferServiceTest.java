package com.example.app.service;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SameCostOfferServiceTest {

    @Test
    public void shouldApply_SameCostOfferService() throws Exception {
        //given
    	SameCostOfferService sameCostOfferService = new SameCostOfferService();

        //when

        //then
        assertThat("1 Item", sameCostOfferService.apply(new Integer[]{60}), is(60));
        assertThat("2 Item", sameCostOfferService.apply(new Integer[]{60,60}), is(120));
        assertThat("3 Item", sameCostOfferService.apply(new Integer[]{60,60,60}), is(180));
    }
}