package com.w5assg;

class user{
    String username = "ram";
    private String password = "ram123";
    private int pin;

}
public class accessModifier {
    public static void main(String[] args) {
        user u1 = new user();
        System.out.println(u1.username);
        //System.out.println(u1.password);
    }
}
