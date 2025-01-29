package com.third_week;

public class UserValidation {
    static void Validate(String username, String password){
        String[] usernames = {"Swornim", "Shlok", "Rasik"};
        String[] passwords = {"Swornim123", "Shlok123", "Rasik123"};
        boolean userExists = false;
        int index = 0;
        for (int i = 0; i < usernames.length ; i++) {
            if (username.equals(usernames[i])){
                userExists = true;
                if (password.equals(passwords[i])){
                    System.out.println("Validated");
                    break;
                }
                else {
                    System.out.println("Incorrect Password");
                }
                break;
            }
            else{
                userExists = false;
                //System.out.println("Username doesnt exist");
            }

        }
        if (userExists == false){
            System.out.println("User doesnt exist");
        }
    }
    public static void main(String[] args) {
        Validate("Shlok", "Shlok123");
    }
}
