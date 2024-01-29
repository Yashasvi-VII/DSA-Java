/*
To make normal objects/class as threads just extend with Threads.
With the help of start method we can start thread. Start is a method that belongs to Thread class, it will call
a run method not the start method.And we need to have a run method in every thread.

Scheduler in OS is responsible to thread to execute. We can not control the threads we can give them priority
1 is least priority and 10 is highest priority 5 is default/normal priority.
we can set the priority using set Priority method, but at last it's up to scheduler what to execute first.using
priority we can just suggest them.

We can ask thread to sleep for some mili seconds but put in try catch, as sleep will throw interrupted exception.
*/

class demoThreadClassA extends Thread {

    //    public void show() {
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

class demoThreadClassB extends Thread {

    //    public void show() {
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


public class Threads {
    public static void main(String[] args) {

        demoThreadClassA obj1 = new demoThreadClassA(); /* This is thread now*/
        demoThreadClassB obj2 = new demoThreadClassB(); /* This is thread now*/

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
