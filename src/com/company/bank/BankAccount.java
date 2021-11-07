package com.company.bank;

public class BankAccount {
    // Declare the properties of a bank account
    private final String customerName;
    private final String accountNumber;
    private float amount;
    private final Bank bank;
    private String pin;
    private String accountType;

    // Define constructor


    public BankAccount(String customerName, String accountNumber, float amount, Bank bank, String pin, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.bank = bank;
        this.pin = pin;
        this.accountType = accountType.toLowerCase();
    }

    // Define getters
    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAmount() {
        return amount;
    }

    public Bank getBank() {
        return bank;
    }

    public String getAccountType() {
        return accountType;
    }

    // Define setters
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    // Define methods
    // depositMoney
    public void depositMoney(int depositAmount) {
        this.amount += depositAmount;
        System.out.println("You have been credited with " +
                depositAmount + ". Your new balance is: " +
                this.amount);
    }

    // transferMoney
    public void transferMoney(String enteredPin, int transferAmount, BankAccount receiver) {
        if (this.pin.equals(enteredPin)) {
            // remove the amount from the sender's account
            // and add it to the receiver's account
            if (receiver.bank.equals(this.bank)) {
                this.amount -= transferAmount;
                receiver.setAmount(receiver.getAmount() + transferAmount);
                System.out.println("You have transferred " + transferAmount
                        + " to: " + receiver.getCustomerName() + ". Your new balance is: "
                        + this.amount);
            } else {
                // If the sender's bank is different from the receiver's bank
                // then add the 5 dollar charge
                this.amount -= (transferAmount + this.bank.getTransactionFee());
                receiver.setAmount(receiver.getAmount() + transferAmount);
                System.out.println("You have transferred " + transferAmount
                        + " to: " + receiver.getCustomerName() + ". Your new balance is: "
                        + this.amount);
            }
        } else {
            System.out.println("You entered an incorrect pin.");
        }
    }

    // withdrawMoney
    public void withdrawMoney(String enteredPin, int withdrawalAmount) {
        if (this.pin.equals(enteredPin)) {
            this.amount -= withdrawalAmount;
            System.out.println("You have been debited " +
                    withdrawalAmount + ". Your new balance is: " +
                    this.amount);
        } else {
            System.out.println("You entered an incorrect pin.");
        }
    }
}
