package com.keyin;



public class TestAccount {

    public static void main(String[] args) {
        // a. create accounts

        // create acc1
        Account acc1 = new Account("1234","Devin",5_000);


       // create acc2
        Account acc2 = new Account("4321","Allison",4_000);

        // b. current balance of both accounts display
        System.out.println("Account with id of: "+ acc1.getId() + " " +   "has a balance of " + acc1.getBalance());

        System.out.println("Account with id of: "+ acc2.getId() + " " + "has a balance of " + acc2.getBalance());

        // c. withdraw $1000 from acc1 and add to acc2 balance

        acc1.TransferTo(acc2,1000);

        // d. display new balance of each account
        System.out.println("New balance of acc1 is: " + acc1.getBalance());

        System.out.println("New balance of acc2 is: " + acc2.getBalance());



    }
}
