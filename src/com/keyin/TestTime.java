package com.keyin;


public class TestTime {
public TestTime(){};

    public static void main(String[] args) {
        // a. create Two time objects t1, t2 & set time
        Time t1 = new Time();

        Time t2 = new Time();

        // setting time
        t1.setTime(21,10,15);
        t2.setTime(10,20,25);

        // attempting to call nextSecond() for t1 and previousSecond() for t2

        System.out.println(t1.nextSecond());

        System.out.println(t2.previousSecond());

    }

}
