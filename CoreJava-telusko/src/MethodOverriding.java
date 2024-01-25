class Demo {
    public void show() {
        System.out.println("in Demo Show");
    }

    public void config() {
        System.out.println("in Demo config");
    }
}

class Demo2 extends Demo {

    //OverRiding show method in this class
    @Override
    public void show() {
        System.out.println("in Demo2 show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Demo2 obj = new Demo2();
        obj.show();
        obj.config();
        obj.show();
    }
}
