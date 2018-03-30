package com.shuvro.practice.processors;

import com.shuvro.practice.nstruments.Instrument;
import com.shuvro.practice.nstruments.InstrumentType;

public class BkashPaymentProcessor {

    public static class PaymentProccessor {
        public  void process(Instrument instrument , double amount) throws Exception {
            if (instrument.getInstrumetType().equals(InstrumentType.card)) {
                System.out.println("Transaction occure with card");
            } else  if ( instrument.getInstrumetType().equals(InstrumentType.cash)) {
                System.out.println("Transaction occure with cash");
            } else if (instrument.getInstrumetType().equals(InstrumentType.cheque)){
                System.out.println("Transaction occure with check");
            } else {
                throw  new  Exception("Invalid Tyepe");
            }
        }
    }
}
