package com.example.app.factory;

import com.example.app.service.OfferService;
import com.example.app.service.SameCostOfferService;

public class SameCostOfferServiceFactory {

    public OfferService offerFor(String name) {
        switch(name.toLowerCase()) {
            case("apple"):
                return new SameCostOfferService();
            case ("orange"):
                return new SameCostOfferService();
            default:
                throw new IllegalArgumentException(name + " Item not listed");
        }
    }

}
