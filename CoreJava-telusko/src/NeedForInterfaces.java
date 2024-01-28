/*
Developer needs a laptop/desktop, so developer class will accept laptop object or desktop object.
but we can only write one object to developer class.

So as a designing part we need to make our code flexible, here we are doing a tight coupling
(As developer is dependent on laptop) rather developer is dependent on computer and computer
is a generic machine  it can be laptop or desktop.

so we can improve it by making a computer class and rest all class extends computer class.
*/

class Computer {

    public void code() {

    }
}

class Laptop extends Computer {

    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("code, compile, run: faster");
    }
}

class Developer {

    public void devApp(Computer comp) {

        // code will be called according to the desktop or laptop object.
        comp.code();
    }
}

public class NeedForInterfaces {
    public static void main(String[] args) {

        // Laptop lap = new Laptop();
       // Desktop desk = new Desktop();

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer yashasvi = new Developer();
        yashasvi.devApp(lap);
    }
}
