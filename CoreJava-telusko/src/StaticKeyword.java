class Mobile {
    //Instance variables
    String brand;
    int price;

    //static is shared by all the objects
    // Any change in name value will affect
    // all the objects, it is a class member not object member.
    static String name;

    public void show(){
        // we can use static variable name in non-static methods
        System.out.println(brand+" "+ price+" " + name);

    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
//        obj1.name = "Smartphone";
        //static variable should be called with their classNames
Mobile.name="Smartphone";
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 80000;
        obj2.name = "Smartphone";

//        obj1.name="Phone";

        obj1.show();
        obj2.show();
    }
}
