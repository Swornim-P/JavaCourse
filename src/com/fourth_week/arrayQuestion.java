package com.fourth_week;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> grocery = new ArrayList<>();
        System.out.println("Choose an option");
        System.out.println("Option 1: Add item     " + "    Option 2: View items");
        System.out.println("Option 3: Remove item   " + "   Option 4: End Program");
        int option = sc.nextInt();
        while (option !=4){
            switch (option){
                case 1:
                    System.out.println("Enter item");
                    String item = sc.next();
                    grocery.add(item);
                    System.out.println("Item added");
                    break;
                case 2:
                    System.out.println("View Item");
                    System.out.println(grocery);
                    break;
                case 3:
                    System.out.println("Remove Item");
                    String toRemove = sc.next();
                    grocery.remove(toRemove);
                    System.out.println("Item Remvoed");
                    break;
            }
            System.out.println("====================================================");
            System.out.println("Choose an option");
            System.out.println("----------------------------------------------------");
            System.out.println("Option 1: Add item     " + "    Option 2: View items");
            System.out.println("Option 3: Remove item   " + "   Option 4: End Program");
            option = sc.nextInt();
        }





    }


}
