package com.week6;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super (message);
    }

}
public class bank {

    private static int balance = 3000;
    public static void withdraw(int amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");

        }
        else{
            balance -= amount;
            System.out.println("Withdraw successful");
            System.out.println("Remaining balance = "+ balance);

        }
    }

    public static void main(String[] args) {
        try{
            withdraw(5000);
        } catch (InsufficientBalanceException e) {
            throw new RuntimeException(e);
        }
    }
}
