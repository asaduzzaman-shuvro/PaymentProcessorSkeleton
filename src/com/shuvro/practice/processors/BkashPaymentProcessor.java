package com.shuvro.practice.processors;


import com.shuvro.practice.nstruments.Instrument;

public class BkashPaymentProcessor implements PaymentProcessDelegate  {


    @Override
    public void process(Instrument instrument, double amount) throws Exception {
        System.out.println("Bksah payment ocurred.");
    }
}
