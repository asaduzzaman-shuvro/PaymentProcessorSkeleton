package com.shuvro.practice.nstruments;

public class Bkash extends PaymentMedium {

    private String mobileNumber;

    public Bkash(InstrumentType instrumentType, String organizationName, String customerName, String mobileNumber) {
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
