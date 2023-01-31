package com.keyin;



public class Account {
    private String id;
    private String name;
    private int balance;

    // set balance to 0.00
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // deposit (credit)
    public int credit(int amount){
        balance = this.balance + amount;
        return balance;
    }
    // withdraw (debit)
    public int debit(int amount){
        if(amount <= balance){
            balance = balance - amount;
        } else{
            System.out.println("Transaction cancelled - Insufficient funds");
        }
        return balance;
    }
    public String getId() {

        return id;
    }
    public int TransferTo(Account another,int amount){

        if(amount <= balance){
            balance = balance - amount;
        another.credit(amount);
        } else{
            System.out.println("Transaction cancelled - Insufficient funds");
        }
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
