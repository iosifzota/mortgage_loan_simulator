package com.daw.mortgage_loan_simulator.model;

import java.util.List;

public class LoanOfferDao implements Dao<LoanOffer> {

    private final List<LoanOffer> records;

    public LoanOfferDao(List<LoanOffer> records) {
        this.records = records;
    }

    @Override
    public List<LoanOffer> all() {
        return records;
    }

    @Override
    public void add(LoanOffer record) {
        records.add(record);
    }

    @Override
    public void remove(LoanOffer record) {
        records.remove(record);
    }
    
}

