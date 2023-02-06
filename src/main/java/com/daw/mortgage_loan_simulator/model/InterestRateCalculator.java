package com.daw.mortgage_loan_simulator.model;

public class InterestRateCalculator {

    private static final double VARIABLE_INTEREST_RATE = 8.2;
    private final double interestRate;

    public InterestRateCalculator(boolean isFixed) {
        this.interestRate = isFixed ? VARIABLE_INTEREST_RATE + 1.5 : VARIABLE_INTEREST_RATE;
    }

    public double rate() {
        return interestRate;
    }
    
}
