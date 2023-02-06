package com.daw.mortgage_loan_simulator.model;

public class LoanRequest {
    private final int value;
    private final int durationInYears;

    public LoanRequest(int value, int durationInYears) {
        this.value = value;
        this.durationInYears = durationInYears;
    }

    public int getValue() {
        return value;
    }

    public int getDurationInYears() {
        return durationInYears;
    }
}
