package com.mycompany.loanapplication;

public abstract class Loan {
    private String loan_id;
    protected String loan_type;
    private Number amount;
    private String cust_name;

    public Loan() {
        this.amount = 0.0;
    }

    public void setLoan_id(String loan_id) {
        this.loan_id = loan_id;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getLoan_id() {
        return loan_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    // Method to set loan amount
    public void setAmount(Number amount) {
        this.amount = amount;
    }

    // Method to get loan amount
    public Number getAmount() {
        return amount;
    }

    // Abstract method to indicate loan type
    public abstract String getLoanType();
}