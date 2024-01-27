/*
When we have abstract class with abstract methods, all this is decided at design time like what are the classes we need
what are the abstract classes we need, so decide the hierarchy.

When we have a class that have only abstract methods, there is another alternative for that is to create a interface.

Most of the time interface is created in project development.

Interface is not a class.
By Default every method in interface is public abstract, So we don't need to mention the keywords public abstract.

when ever we want to implement the interface we use implements keyword, and when you say implements then
it become compulsory to implements both the methods and if you fail to define both the methods then by default class
becomes abstract.

Every variable in interface is by default final and static. we don't get the variables in the implements.

One class can implements multiple interfaces.

Whenever we do interface to interface we say extends.
 */

interface demoInterface {

    int age=44;
    String area="india";

    void show();

    void config();
}

interface temp{
    void run();
}

interface temp2 extends temp{
    void run();
}

class demoClass implements demoInterface,temp {
    public void show() {
        System.out.println("in Show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run(){
        System.out.println("is running");
    }
}

public class Interface {
    public static void main(String[] args) {

        demoInterface obj;

        obj = new demoClass();

        obj.show();
        obj.config();

        System.out.println(demoInterface.age);
        System.out.println(demoInterface.area);
    }
}
