package com.shuvro.practice.nstruments;

public class EBL extends PaymentMedium {

    private String transactionNumber;

    public EBL(InstrumentType instrumentType, String organizationName, String customerName, String transactionNumber) {
        super(instrumentType, organizationName, customerName);
        this.transactionNumber = transactionNumber;
    }

    @Override
    public InstrumentType getInstrumetType() {
        return super.getInstrumetType();
    }

    public String getTransactionNumber(){
        return this.transactionNumber;
    }
}
