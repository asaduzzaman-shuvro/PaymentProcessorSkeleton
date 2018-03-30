package com.shuvro.practice.nstruments;

public class DebitCard implements Instrument {
    private  InstrumentType instrumentType;

    public DebitCard(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }


    @Override
    public void setFinancialOrigazationName(String fininacialOrganizationName) {

    }

    @Override
    public void setCustomername(String customername) {

    }

    @Override
    public void setInstrumentType(InstrumentType instrumentType) {

    }

    @Override
    public InstrumentType getInstrumetType() {
        return this.instrumentType;
    }
}
