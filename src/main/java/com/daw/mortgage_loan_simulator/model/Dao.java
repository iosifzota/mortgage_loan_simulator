package com.daw.mortgage_loan_simulator.model;

import java.util.List;

public interface Dao<T> {
    List<T> all();
    void add(T record);
    void remove(T record);
}
