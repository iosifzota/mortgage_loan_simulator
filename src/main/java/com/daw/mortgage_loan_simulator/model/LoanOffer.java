package com.daw.mortgage_loan_simulator.model;

public class LoanOffer {
    private final String name;
    private final double loanValue;
    private final double monthlyBill;
    private final double interestRate;
    private final double finalValuePayed;
    private final int durationInYears;

    public LoanOffer(String name, double loanValue, double monthlyBill, double interestRate, double finalValuePayed,
            int durationInYears) {
        this.name = name;
        this.loanValue = loanValue;
        this.monthlyBill = monthlyBill;
        this.interestRate = interestRate;
        this.finalValuePayed = finalValuePayed;
        this.durationInYears = durationInYears;
    }

    public String getName() {
        return name;
    }

    public double getLoanValue() {
        return loanValue;
    }

    public double getMonthlyBill() {
        return monthlyBill;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getFinalValuePayed() {
        return finalValuePayed;
    }

    public int getDurationInYears() {
        return durationInYears;
    }
}

