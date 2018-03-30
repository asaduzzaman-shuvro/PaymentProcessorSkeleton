package com.shuvro.practice.processors;

import com.shuvro.practice.nstruments.Instrument;

public class ChequePaymentProcessor implements PaymentProcessDelegate  {


    @Override
    public void process(Instrument instrument, double amount) throws Exception {
        System.out.println("cash payment ocurred.");
    }
}
