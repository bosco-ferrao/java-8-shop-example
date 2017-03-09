package com.example.app;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

import com.example.app.factory.SameCostOfferServiceFactory;

public class CheckoutSystemWithoutOfferIntegrationTest {

    private CheckoutSystemWithoutOffer checkoutSystem;

    @Before
    public void setUp() throws Exception {
        checkoutSystem = new CheckoutSystemWithoutOffer(new SameCostOfferServiceFactory());
    }

    @Test
    public void shouldPrintReceiptForShoppingCartContainingApple() throws Exception {
        //given

        //when

        //then
        assertThat("1 Apple", checkoutSystem.printReceipt(asList("Apple")), is("£0.60"));
        assertThat("2 Apple", checkoutSystem.printReceipt(asList("Apple","Apple")), is("£1.20"));
        assertThat("3 Apple", checkoutSystem.printReceipt(asList("Apple", "Apple", "Apple")), is("£1.80"));
        
    }
    
    @Test
    public void shouldPrintReceiptForShoppingCartContainingOrange() throws Exception {
        //given

        //when

        //then
        assertThat("1 Apple", checkoutSystem.printReceipt(asList("Orange")), is("£0.25"));
        assertThat("2 Apple", checkoutSystem.printReceipt(asList("Orange","Orange")), is("£0.50"));
        assertThat("3 Apple", checkoutSystem.printReceipt(asList("Orange", "Orange", "Orange")), is("£0.75"));
        
    }
    
    @Test
    public void shouldPrintReceiptForShoppingCartContainingAppleAndOrange() throws Exception {
        //given

        //when

        //then
        assertThat("1 Apple, 1 Orange", checkoutSystem.printReceipt(asList("Apple", "Orange")), is("£0.85"));
        assertThat("3 Apple, 1 Orange", checkoutSystem.printReceipt(asList("Apple","Apple","Orange","Apple")), is("£2.05"));
        
        
    }
}