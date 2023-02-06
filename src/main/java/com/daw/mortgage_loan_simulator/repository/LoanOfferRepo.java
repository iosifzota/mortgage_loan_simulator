package com.daw.mortgage_loan_simulator.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.daw.mortgage_loan_simulator.model.LoanOffer;

@Repository
public class LoanOfferRepo {

    private final List<LoanOffer> records;

    public LoanOfferRepo() {
        this.records = new ArrayList<>();
        this.records.add(new LoanOffer("(dummy) Imprumut cu dobanda variabila", 2500, 100, 8.0, 0, 1));
        this.records.add(new LoanOffer("(dummy) Imprumut cu dobanda fixa", 42100, 2500, 7.9, 0, 5));
    }

    public List<LoanOffer> all() {
        return records;
    }

}
