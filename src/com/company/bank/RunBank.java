package com.company.bank;

public class RunBank {
    public static void main(String[] args) {
        Bank federalReserve = new Bank("Federal Reserve",5);
        Bank wellsFargo = new Bank("Wells Fargo", 3);

        BankAccount georgeClooney = new BankAccount(
                "George Clooney",
                "JS1244",
                900,
                federalReserve,
                "8899",
                "savings");

        BankAccount davidSamson = new BankAccount(
                "David Samson",
                "HH2340",
                1200,
                federalReserve,
                "9923",
                "current"
        );

        BankAccount georgeBush = new BankAccount(
                "George Bush",
                "UI4210",
                2000,
                wellsFargo,
                "7676",
                "savings"
        );

        federalReserve.setBankAccounts(new BankAccount[] {georgeClooney, davidSamson});
        wellsFargo.setBankAccounts(new BankAccount[] {georgeBush});

        // account methods
//        georgeBush.depositMoney( 200);
//        georgeBush.transferMoney("7676", 200, davidSamson);
//        georgeBush.withdrawMoney("7676", 200);

        // Bank methods
        System.out.println("Total money in " +federalReserve.getBankName() + " is: " + federalReserve.getTotalMoneyInBank());
        System.out.println("Total Current amount in " + federalReserve.getBankName() + " is: " + federalReserve.getTotalCurrentAmount());
        System.out.println("Total Savings amount in " + wellsFargo.getBankName() + " is: " + wellsFargo.getTotalSavingsAmount());
    }
}
