package bankaccount;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<String> transactionHistory =new ArrayList<>();
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount <=0){
            throw new IllegalArgumentException("Amount must be a positive number");
        }
        balance += amount;
        transactionHistory.add("Deposited : "+amount);
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <=0){
            throw new IllegalArgumentException("Enter a valid amount");
        }
        if(amount>balance){
            throw new InsufficientFundsException("Amount must be within the balance");
        }
        balance -= amount;
        transactionHistory.add("Withdrawn : "+amount);
    }
    public void printHistory(){
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }
}
