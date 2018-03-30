package com.shuvro.practice;

import com.shuvro.practice.nstruments.DebitCard;
import com.shuvro.practice.nstruments.InstrumentType;
import com.shuvro.practice.processors.BkashPaymentProcessor;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        DebitCard debitCard = new DebitCard(InstrumentType.card);

//        BkashPaymentProcessor.PaymentProccessor paymentProccessor = new BkashPaymentProcessor.PaymentProccessor();
//        paymentProccessor.process(debitCard,200);
    }
}
