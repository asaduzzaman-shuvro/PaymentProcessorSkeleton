package com.shuvro.practice.nstruments;

public class Card extends PaymentMedium {

    private String cardNumber;
    public Card(InstrumentType instrumentType, String organizationName, String customerName, String cardNumber) {
        super(instrumentType, organizationName, customerName);
        this.cardNumber = cardNumber;
    }

    @Override
    public InstrumentType getInstrumetType() {
        return super.getInstrumetType();
    }

    public String getCardNumber(){
        return  this.cardNumber;
    }
}
