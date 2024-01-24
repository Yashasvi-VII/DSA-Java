class Mobile {
    //Instance variables
    String brand;
    int price;

    //Static variable
    static String name;

    //we can initialise the static variable in static block
    static {
        // this block will be called only once, irrespective how
        // many objects you create.
        name = "phone";
        System.out.println("in static block");
    }

    //constructor
    public Mobile() {
        brand = "";
        price = 10000;
        System.out.println("in constructor");

    }
    public void show() {
        // we can use static variable name in non-static methods
        System.out.println(brand + " " + price + " " + name);

    }
}

public class StaticMethods {
    public static void main(String[] args) throws ClassNotFoundException {

//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 100000;
//        obj1.show();
//
//        Mobile obj2 = new Mobile();
//
//        when object is not created class is also not loaded
//        so to load the class without creating an object. Can be done
//        for name, it will not create object it will instantiate it.
        Class.forName("Mobile");


    }
}
