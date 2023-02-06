package com.daw.mortgage_loan_simulator.service;

import org.springframework.stereotype.Service;

import com.daw.mortgage_loan_simulator.model.Dao;
import com.daw.mortgage_loan_simulator.model.LoanOffer;
import com.daw.mortgage_loan_simulator.model.LoanOfferDao;
import com.daw.mortgage_loan_simulator.repository.LoanOfferRepo;

@Service
public class LoanOfferService {

    private final LoanOfferRepo repo;
    private LoanOffer lastCalculatedOffer;

    public LoanOfferService(LoanOfferRepo repo) {
        this.repo = repo;
        this.lastCalculatedOffer = null;
    }

    public Dao<LoanOffer> getDao() {
        return new LoanOfferDao(repo.all());
    }

    public void calculate(int val, int years) {
        lastCalculatedOffer = new LoanOffer("test1", val, val / (years * 12), 9.0, 0, years);
    }

    public LoanOffer lastCalculated() {
        return lastCalculatedOffer;
    }
}
