package com.shuvro.practice.processors;

import com.shuvro.practice.nstruments.Instrument;

public class PaymentProcessor {
    private PaymentProcessDelegate paymentProcessor;
    private Instrument instrument;

    public PaymentProcessor(Instrument instrument) {
        this.instrument = instrument;
    }

    public void process(double amount) throws Exception {
        try {
            paymentProcessor.process(this.instrument,amount);
        } catch (Exception e) {
            throw new  Exception("Invalid instrument type");
        }
    }
}
