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

        //We need down casting because even if object is of upcasting demo2
        //we cannot call show2 method
        // obj1.show2();

        //Down casting
        UpcastingDemo2 obj2 = (UpcastingDemo2) obj1;
        obj2.show2();
    }
}
