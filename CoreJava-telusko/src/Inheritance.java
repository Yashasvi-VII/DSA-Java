class AdvanceCalculator {

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}

// simple calculator inherits advance calculator class using extends keyword
class SimpleCalculator extends AdvanceCalculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        SimpleCalculator obj = new SimpleCalculator();

        int r1 = obj.add(11, 4);
        int r2 = obj.sub(98, 67);

        System.out.println(r1 + " " + r2);

        //simple calculator class object now can access methods of advance calculator
        int r3 = obj.multiply(3, 4);
        int r4 = obj.divide(100, 10);

        System.out.println(r3 + " " + r4);
    }
}
