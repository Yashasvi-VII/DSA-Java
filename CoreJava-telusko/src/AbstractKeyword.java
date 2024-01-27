/*
Abstract method can only be declared in abstract class.

Which ever class is inheriting the abstract class have to overRide the methods.

We can not create instance/object of abstract class. But we can create reference of abstract class.

It is not mandatory to have abstract method inside the abstract class.But it is mandatory for subclass
to define all the abstract methods.
 */

abstract class Car {

    //Declaring method instead of defining method
    // by doing this we can not make object of it
    public abstract void drive();

    public void playMusic() {
        System.out.println("in music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving..");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

        // creating reference of abstract class
        Car obj = new WagonR();
        obj.playMusic();
        obj.drive();
    }
}
