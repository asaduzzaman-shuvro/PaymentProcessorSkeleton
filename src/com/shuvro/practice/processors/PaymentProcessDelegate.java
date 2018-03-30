package com.shuvro.practice.processors;

import com.shuvro.practice.nstruments.Instrument;

public interface PaymentProcessDelegate {
    public  void process(Instrument instrument, double amount) throws Exception;
}
