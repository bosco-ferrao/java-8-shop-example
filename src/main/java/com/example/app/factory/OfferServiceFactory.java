package com.example.app.factory;

import com.example.app.service.Buy1Get1OfferService;
import com.example.app.service.Buy3For2OfferService;
import com.example.app.service.OfferService;

public class OfferServiceFactory {

    public OfferService offerFor(String name) {
        switch(name.toLowerCase()) {
            case("apple"):
                return new Buy1Get1OfferService();
            case ("orange"):
                return new Buy3For2OfferService();
            default:
                throw new IllegalArgumentException(name + " Item not listed");
        }
    }

}
