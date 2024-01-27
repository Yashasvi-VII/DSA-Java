/*
Anonymous class is used lot in interfaces.
 */

class AnonymousClassA {

    int age;

    public void show() {
        System.out.println("in A show");
    }
}

// we don't need to make class just to override the method.

// class AnonymousClassB extends AnonymousClassA {
//
//    public void show() {
//        System.out.println("in show");
//    }
//}


public class AnonymousClass {
    public static void main(String[] args) {

        AnonymousClassA obj = new AnonymousClassA() {
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
