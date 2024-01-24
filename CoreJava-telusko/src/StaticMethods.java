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

    public static void show1(Mobile obj){
        System.out.println("in static method");
//        we can use static variable inside a static method but we can not use non-static variables inside
//                a static method to do that we need to pass obj
        System.out.println(obj.brand + " " + obj.price + " " + name);

    }
}

public class StaticMethods {
    public static void main(String[] args) throws ClassNotFoundException {

//        we can't make static reference to non-static method show
//        we need object to call show
//         Mobile.show();

//        but we can call show1 using class name
        Mobile obj= new Mobile();
        Mobile.show1(obj);
    }
}
