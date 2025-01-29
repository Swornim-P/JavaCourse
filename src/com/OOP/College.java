package com.OOP;
public class College {
    String name;
    String address;
    String university;
    public void collegeInfo(){
        System.out.println("College Name: " + this.name);
        System.out.println("College Address: " + this.address);
        System.out.println("Parent University + " + this.university);
    }
    College(String name, String address, String university){
        this.name = name;
        this.address = address;
        this.university = university;
    }
}
class HistorySection extends College{
    String headName;
    int fees;
    HistorySection(String name, String address, String university) {
        super(name, address, university);
    }
    public void printInfo(){
        collegeInfo();
        System.out.println("History Head: " + this.headName);
        System.out.println("History Fees: " + this.fees);
    }
}
class ITSection extends College{
    String headName;
    int fees;

    ITSection(String name, String address, String university) {
        super(name, address, university);
    }
    public void printInfo(){

        System.out.println(this.headName);
        System.out.println(this.fees);
    }
}
class LibrarySection extends College{
    String headName;
    int fees;

    LibrarySection(String name, String address, String university) {
        super(name, address, university);
    }

    public void printInfo(){
        System.out.println(this.headName);
        System.out.println(this.fees);
    }
}




