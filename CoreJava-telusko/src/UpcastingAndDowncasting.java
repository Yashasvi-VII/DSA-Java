class UpcastingDemo1 {

    public void show1(){
        System.out.println("In demo 1 show");
    }
}

class UpcastingDemo2 extends UpcastingDemo1{
    public void show2(){
        System.out.println("In demo 2 show");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {

        //upcasting subclass to parent class
        UpcastingDemo1 obj1= (UpcastingDemo1) new UpcastingDemo2();
        obj1.show1();
    }
}
