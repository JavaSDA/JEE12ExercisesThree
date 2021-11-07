package com.company.bank;

public class Bank {
    // Define the properties
    private String bankName;
    private BankAccount[] bankAccounts;
    private float transactionFee;

    public Bank(String bankName, float transactionFee) {
        this.bankName = bankName;
        this.transactionFee = transactionFee;
    }

    public Bank(String bankName, BankAccount[] bankAccounts, int transactionFee) {
        this.bankName = bankName;
        this.bankAccounts = bankAccounts;
        this.transactionFee = transactionFee;
    }

    // Getters
    public String getBankName() {
        return bankName;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public float getTransactionFee() {
        return transactionFee;
    }

    // setters

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void setTransactionFee(int transactionFee) {
        this.transactionFee = transactionFee;
    }

    // Behaviour
    public float getTotalMoneyInBank() {
        // initialize sum to zero
        float sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            sum += bankAccount.getAmount();
        }
        return sum;
    }

    public float getTotalCurrentAmount() {
        // initialize sum to zero
        float sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountType().equals("current")) {
                sum += bankAccount.getAmount();
            }
        }
        return sum;
    }

    public float getTotalSavingsAmount() {
        // initialize sum to zero
        float sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountType().equals("savings")) {
                sum += bankAccount.getAmount();
            }
        }
        return sum;
    }

    public float getTotalFixedAmount() {
        // initialize sum to zero
        float sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountType().equals("fixed")) {
                sum += bankAccount.getAmount();
            }
        }
        return sum;
    }

}
