package com.fourth_week;

class VehicleNew{
    String regNo;
    String model;
    public void run(){
        System.out.println("run");
    }
    public void showInfo(){
        System.out.println("regno: " + regNo + " model: " + model);
    }
}
class TwoWheeler extends VehicleNew{
    @Override
    public void run(){
        System.out.println("2 wheeler go brrrr");
    }
}
class Library{
    private String bookName;
    private String LibraryName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
public class javaPolymorphism {
    public void sum(int a, int b) {
        System.out.println("Sum = "+ (a+b));
    }
    public void sum(int a, int b, int c){
        System.out.println("Sum = "+ (a+b+c));
    }
    public void sum (int a, double b){
        System.out.println("Sum = "+ (a+b));
    }
    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler();
        tw.regNo = "123abc";
        tw.model = "honda";
        tw.showInfo();
        tw.run();
    }
}
