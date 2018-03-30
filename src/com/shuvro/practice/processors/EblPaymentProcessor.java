package com.shuvro.practice.processors;

import com.shuvro.practice.nstruments.Instrument;

public class EblPaymentProcessor implements PaymentProcessDelegate  {


    @Override
    public void process(Instrument instrument, double amount) throws Exception {
        System.out.println("EBL payment ocurred.");
    }
}
