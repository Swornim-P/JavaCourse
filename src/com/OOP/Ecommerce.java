package com.OOP;

public class Ecommerce {
    String product;
    String customer;
    String cart;

}
class Product extends Ecommerce{
    int id;
    String name;
    String category;
    double price;

}
class Customer extends Ecommerce{
    int id;
    String name;
    String address;
    int phoneNo;
}
class Cart extends Product{
    int id;
    String productname;
    String DeliveryDate;
    int Quantity;

    Cart(int id, String productname, String DeliveryDate, int Quantity){
        this.id = id;
        this.productname = productname;
        this.DeliveryDate = DeliveryDate;
        this.Quantity = Quantity;
    }
}
