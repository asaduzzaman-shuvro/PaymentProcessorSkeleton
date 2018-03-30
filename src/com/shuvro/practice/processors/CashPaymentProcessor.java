package com.shuvro.practice.processors;

import com.shuvro.practice.nstruments.Instrument;

public class CashPaymentProcessor implements PaymentProcessDelegate  {


    @Override
    public void process(Instrument instrument, double amount) throws Exception {
        System.out.println("Cash payment ocurred.");
    }
}
