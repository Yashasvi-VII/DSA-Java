/*
Every constructor in java has a method which is there, even if we don't mention That
is super.
Super method simply means call the constructor of the super class first.
Every class in java extends object class which is class in java with lot of methods
 */

class A extends Object{

    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        // To call parametrized constructor of A, simply pass variable in super
        super(n);
        System.out.println("in B int");
    }
}

public class SuperAndThisKeyword {
    public static void main(String[] args) {

        B obj = new B(5);
    }
}
