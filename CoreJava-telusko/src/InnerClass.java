/*
Class inside a class
 */

class InnerClassA {

    int age;

    public void show() {
        System.out.println("in show");
    }

    class InnerClassB {
        //we can also make this class static
        // so we don't need to make object of it.
        public void config() {
            System.out.println("in config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        InnerClassA obj = new InnerClassA();
        obj.show();

        // Can not do
        //InnerClassB obj = new InnerClassB();

        InnerClassA.InnerClassB obj1 = obj.new InnerClassB();
        obj1.config();
    }
}
