package com.shuvro.practice.nstruments;

public class Ucash extends PaymentMedium {

    private String mobileNumber;

    public Ucash(InstrumentType instrumentType, String organizationName, String customerName, String mobileNumber) {
        super(instrumentType, organizationName, customerName);
        this.mobileNumber = mobileNumber;
    }

    @Override
    public InstrumentType getInstrumetType() {
        return super.getInstrumetType();
    }

    public  String getMobileNumber() {
        return  this.mobileNumber;
    }
}
