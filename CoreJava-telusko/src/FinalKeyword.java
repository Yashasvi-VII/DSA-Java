/*
Final keyword can be used with class, variable and method
its like const in c++.
If we make a class final we cannot inherit that class.
If we make a method final we cannot override it.
 */

class Cal {

    public final void show() {
        System.out.println("in Cal show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCal extends Cal {

    //@Override
    //public void show(){
    //Can not override final method
//}
}

public class FinalKeyword {
    public static void main(String[] args) {

        //Final keyword
        final int num = 2;
        System.out.println(num);

        //  num=5;   can not modify final variable

        Cal obj = new Cal();
        obj.show();
        obj.add(5, 5);
    }
}
