/*
Class A extends Z , to make A as subclass and Thread but multiple inheritance in java is not possible. So extending
Thread is not a good idea .

Thread is a class which implements runnable and runnable have method run so instead of extending a thread we can
implements runnable

We can have class which is extending another class and implementing the interface at same time.

Thread have multiple constructors

So to create thread we have two choices we can either extend thread class and implements runnable interface,
only problem is runnable interface will not have the thread method, for that we need to create a separate runnable
object and then we can pass that object thread constructor.
*/

class demoRunnableClassA implements java.lang.Runnable {   /* This class is also a thread*/

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class demoRunnableClassB implements java.lang.Runnable {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class Runnable {
    public static void main(String[] args) {

        //These are runnable objects
        java.lang.Runnable obj1 = new demoThreadClassA();
        java.lang.Runnable obj2 = new demoThreadClassB();

        //Creating two threads and passing runnable objects
        //to thread constructor
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
