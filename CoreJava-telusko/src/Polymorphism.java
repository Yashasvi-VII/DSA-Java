/*
Polymorphism have two types, first is compile time (early binding) polymorphism
and second one is run time (late binding) polymorphism and there name explains itself
when the behaviour will be defined in compile time or run time.

Overloading is part of compile time, overRiding is part of run time.

Below is demo code for dynamic method dispatch
 */

class D {
    public void show() {
        System.out.println("in A show");
    }
}

class E extends D {

}

class Computer{

}

class Laptop extends Computer{

}

public class Polymorphism {
    public static void main(String[] args) {

        // Creating reference of a super class and object of the subclass

        D obj = new E();
        obj.show();

        Laptop obj1=new Laptop();
        // We can have object of type parent and object can be of child
        Computer obj2=new Laptop();
    }
}
