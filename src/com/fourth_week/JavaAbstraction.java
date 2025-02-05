package com.fourth_week;

abstract class User{
    abstract void auth();
    public static void userDetail(){
        System.out.println("User Detail");
    }

}
class AdminUser extends User{
    AdminUser(){
        System.out.println("Admin user constructor");
    }
    @Override
    void auth() {
        System.out.println("User authenticated");
    }
}

interface Vehicle{
    void run();
}


public class JavaAbstraction {
    public static void main(String[] args) {
        AdminUser ad = new AdminUser();
        User.userDetail();
    }


}
