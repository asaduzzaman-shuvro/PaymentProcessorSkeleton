package com.shuvro.practice.nstruments;

public class Cheque extends PaymentMedium {

    private String chequeNumber;
    public Cheque(InstrumentType instrumentType, String organizationName, String customerName,String chequeNumber) {
        super(instrumentType, organizationName, customerName);
        this.chequeNumber = chequeNumber;
    }

    @Override
    public InstrumentType getInstrumetType() {
        return super.getInstrumetType();
    }

    public String getCheckNumber() {
        return this.chequeNumber;
    }
}
