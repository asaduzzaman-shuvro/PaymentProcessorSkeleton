package com.shuvro.practice.nstruments;

public class PaymentMedium implements Instrument {

    private InstrumentType instrumentType;
    private String organizationName;
    private String customerName;

    public PaymentMedium(InstrumentType instrumentType, String organizationName, String customerName) {
        this.instrumentType = instrumentType;
        this.organizationName = organizationName;
        this.customerName = customerName;
    }

    @Override
    public InstrumentType getInstrumetType() {
        return this.instrumentType;
    }
}
