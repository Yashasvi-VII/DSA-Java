/*
Functional interface is that which has only one method
we can use lambda expression only with functional interface.
 */



//SAM interface single abstract method interface.
@FunctionalInterface
interface DemoInterface
{
    void show();
}

//class Democlass implements DemoInterface {
//    public void show() {
//        System.out.println("in Show");
//    }
//}

public class FInterface {
    public static void main(String[] args) {

        //Anonymous Class
//        DemoInterface obj = new DemoInterface() {
//            @Override
//            public void show() {
//                System.out.println("in Show");
//            }
//        };

        //Lambda Expression (A syntactical sugar to reduce code)
        DemoInterface obj = () -> {
                System.out.println("in Show");
        };

        obj.show();
    }
}
