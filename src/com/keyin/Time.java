package com.keyin;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public int setHour(int hour) {
        hour = ((hour >= 0 && hour < 24)? hour :0);
        this.hour = hour;
        return hour;
    }

    public int getMinute() {
       minute = ((minute >= 0 && minute < 60)? minute :0);
        return minute;
    }

    public int setMinute(int minute) {
        this.minute = minute;
        return minute;
    }
 public Time nextSecond(){

     this.second += 1;
     return this;
 }

 public Time previousSecond(){

       this.second -= 1; // or can use  getSecond() her
        return this;
 }
    public int getSecond() {
        second = ((second >= 0 && second < 60)? second :0);
        return second;
    }

    public int setSecond(int second) {
        this.second = second;
        return second;
    }

    public void setTime(int hour, int minute, int second){
      setHour(hour);
      setMinute(minute);
      setSecond(second);

    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
