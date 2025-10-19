package com.mycompany.loanapplication;

public class CarLoan extends Loan {
    private double car_lien;

    public CarLoan() {
        super();
        this.loan_type = "Car Loan";
        this.car_lien = 0.0;
    }

    // Method to assign value to lien
    public void setCar_lien(double car_lien) {
        this.car_lien = car_lien;
    }

    // Method to return lien value
    public double getCar_lien() {
        return car_lien;
    }

    // Implementation of abstract method
    @Override
    public String getLoanType() {
        return this.loan_type;
    }
}