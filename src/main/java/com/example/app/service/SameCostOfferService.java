package com.example.app.service;

public class SameCostOfferService implements OfferService {


    @Override
    public int apply(Integer[] itemsCost) {
        int numberOfItems = itemsCost.length;
        
        if(numberOfItems==0){
            return 0;
        }

        return numberOfItems*itemsCost[0];
    }
}
