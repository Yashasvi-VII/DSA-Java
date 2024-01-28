/*
Enums are named constants. error codes when we send request to server then we get response so when we know we have
some specific error codes instead creating a different object by itself we can create an enum

when we want return a status from an application instead of returning a string or object we can simply return a status.

We can't extend enum class to another class , we can create constructor and create variables inside enum.

Enum class extends enum class
 */

// status can be of running state, failed state, success, pending
// we can create a simple class status and create multiple objects or we can create an enum where we define all the names
// constants
//status is a class
enum Status {

    //these are objects.
    Running, Failed, Pending, Success;
}

enum LaptopEnumDemo {

    Macbook(89000), Xps(78000), Surface(), ThinkPad(85000);

    private int price;

    //Default constructor
    private LaptopEnumDemo() {
        price = 76000;
    }


    private LaptopEnumDemo(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum {
    public static void main(String[] args) {

//        int i = 5;
//        Status s = Status.Running;
//
//        System.out.println(s);
//
//        Status[] ss = Status.values();
//
//        for(Status iterator : ss){
//            System.out.println(iterator + " " + iterator.ordinal());
//        }

        //If else in enum
        Status s = Status.Pending;
//
//        if(s==Status.Running){
//            System.out.println("All good");
//        }else if(s == Status.Failed){
//            System.out.println("Try again");
//        }else if(s==Status.Pending){
//            System.out.println("Please wait");
//        }else {
//            System.out.println("Done");
//        }

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Done");
        }

        LaptopEnumDemo lap = LaptopEnumDemo.Macbook;
        System.out.println(lap + " " + lap.getPrice());

        for (LaptopEnumDemo iterator : LaptopEnumDemo.values()) {
            System.out.println(iterator + " : " + iterator.getPrice());
        }
    }
}
