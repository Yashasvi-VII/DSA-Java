/*
frameworks will create threads otherwise we have to create them.
Mutation means change

if we do mutation with multiple threads suppose there are two threads t1 and t2 and both need a variable i and both of
them change the value of it, This will lead to instability in code so when working with the threads always work with
data which is immutable or if there is a method which can do some mutation then make it thread safe.

Thread safe simply means work with one thread at one point of time. synchronized will allow Resource for
single threat at a time

 */

class Counter {

    int count=0;

    public synchronized void increment() {
        count++;
    }
}

public class RaceConditions {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        java.lang.Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        java.lang.Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //Join allow main to wait for thread to finish.
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
