/*
Polymorphism have two types, first is compile time (early binding) polymorphism
and second one is run time (late binding) polymorphism and there name explains itself
when the behaviour will be defined in compile time or run time.

Overloading is part of compile time, overRiding is part of run time.

Below is demo code for dynamic method dispatch

Note:- irrespective of what type of variable you create but all depends upon
what object you have. And that's only possible when you have inheritance
 */

class D {
    public void show() {
        System.out.println("in A show");
    }
}

class E extends D {
public void show(){
    System.out.println("in B show");
}
}


public class Polymorphism {
    public static void main(String[] args) {

        // Creating reference of a super class and object of the subclass
        D obj = new D();
        obj.show();

        // we can assign object to old variable.
        obj = new E();
        //Polymorphism
        obj.show();

    }
}
