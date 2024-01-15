// Declaring and using objects
public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car();

        //To access objects we use Dot operator
        myCar.addFuel(6);
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.addFuel(3);
        System.out.println(myCar.getCurrentFuelLevel());
    }
}
