package com.mycompany.loanapplication;

public class LoanApplication {
    public static void main(String[] args) {
        // Create CarLoan objects
        CarLoan loan1 = new CarLoan();
        CarLoan loan2 = new CarLoan();

        // Assign values to loan1
        loan1.setLoan_id("L001");
        loan1.setCust_name("Arinda Philipo");
        loan1.setAmount(50000);
        loan1.setCar_lien(40000);

        // Assign values to loan2
        loan2.setLoan_id("L002");
        loan2.setCust_name("Kasadha Ezra");
        loan2.setAmount(35000);
        loan2.setCar_lien(25000);

        // Display values for loan1
        System.out.println("Loan 1 Details:");
        System.out.println("Loan ID: " + loan1.getLoan_id());
        System.out.println("Loan Type: " + loan1.getLoanType());
        System.out.println("Loan Amount: UGX " + loan1.getAmount());
        System.out.println("Customer Name: " + loan1.getCust_name());
        System.out.println("Car Lien: UGX " + loan1.getCar_lien());
        System.out.println();

        // Display values for loan2
        System.out.println("Loan 2 Details:");
        System.out.println("Loan ID: " + loan2.getLoan_id());
        System.out.println("Loan Type: " + loan2.getLoanType());
        System.out.println("Loan Amount: UGX " + loan2.getAmount());
        System.out.println("Customer Name: " + loan2.getCust_name());
        System.out.println("Car Lien: UGX " + loan2.getCar_lien());
    }
}