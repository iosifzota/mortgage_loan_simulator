package com.daw.mortgage_loan_simulator.model;

public class LoanRequest {
    private final int value;
    private final int durationInYears;
    private final boolean isFixed;

    public LoanRequest(int value, int durationInYears, boolean isFixed) {
        this.value = value;
        this.durationInYears = durationInYears;
        this.isFixed = isFixed;
    }

    public int getValue() {
        return value;
    }

    public int getDurationInYears() {
        return durationInYears;
    }

    public boolean isFixed() {
        return isFixed;
    }
}
