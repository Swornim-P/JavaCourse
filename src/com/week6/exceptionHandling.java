package com.week6;

public class exceptionHandling {
    public static void divideResult (int divideValue, int divideBy) throws ArithmeticException{
        int res = divideValue/divideBy;
        System.out.println("Result: "+ res);
    }
    public static void main(String[] args) {

//        try{
//            int result = 18/0;
//            String[] names={"ram", "Gayni", "Swornim"};
//            System.out.println("First Val= "+names[0]);
//            System.out.println(names[3]);
//            System.out.println("Hello Java");
//
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception Occured: "+e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println("Exception: "+ e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        }

        divideResult(5, 0);


        System.out.println("Program Executed");

    }
}
