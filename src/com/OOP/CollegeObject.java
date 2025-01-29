package com.OOP;

public class CollegeObject {
    public static void main(String[] args) {
        College Presidential = new College("Presidential Grad School", "Thapagaun", "Westcliff University");
       /* Presidential.name = "Presidential Graduate School";
        Presidential.address = "Thapagaun, Baneshwor";
        Presidential.university = "Westcliff University";*/
        Presidential.collegeInfo();

        HistorySection history =  new HistorySection("Presidential Grad School", "Thapagaun", "Westcliff");

        history.headName = "Someone Somebody";
        history.fees = 10000;
        history.printInfo();

//        ITSection BSCIT = new ITSection();
//        BSCIT.university = "Westcliff University";
//        BSCIT.printInfo();
//
//        LibrarySection library = new LibrarySection();
//        library.name = "Presidential Graduate School";
//        library.fees = 500;
//        library.headName = "Noone";
//        library.printInfo();
//
//        Presidential.collegeInfo();



    }
}
