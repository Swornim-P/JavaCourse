package com.OOP;
class newAnimal{
    String name;
    void eat(){
        System.out.println("Chow Chow Yum");
    }
}
class NewDog extends newAnimal{
    void bark(){
        System.out.println("woof");
    }
}
class Pug extends NewDog{
}
class Cat extends newAnimal{
    void speak(){
        System.out.println("Meow");
    }
}
class NewRat extends newAnimal{
    void speak(){
        System.out.println("Squeak Squeak");
    }
}
public class inheritance{
    public static void main(String[] args) {
        NewDog shreejal = new NewDog();
        shreejal.eat();
        Pug pintu = new Pug();
        pintu.eat();
        pintu.bark();
        Cat Tom = new Cat();
        Tom.eat();
        Tom.speak();
        NewRat Jerry = new NewRat();
        Jerry.eat();
        Jerry.speak();
    }
}
