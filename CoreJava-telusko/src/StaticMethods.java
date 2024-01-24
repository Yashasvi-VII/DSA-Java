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
    public static void main(String[] args) {
        // Creation of object is two step process
        // class loads and objects get instantiated
        //class loads only once, so static block
        // will be called only once.
        // in jvm there is area class loader, class will be loaded to
        //class library to class loader and it will happen only once.And every time
        // class loads it will call static block. so that's why constructor is called
        // after the static block
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        obj1.show();

        Mobile obj2 = new Mobile();

    }
}
