// Declaring and using objects
public class Driver {

    static int minAgeForDriving=18;
    String name;
    int age;
    String dateOfLicence;

    public boolean isAllowedToDrive(){
        return this.age>=minAgeForDriving;
    }

    public static void main(String[] args) {
//        Car myCar = new Car();
//
//        //To access objects we use Dot operator
//        myCar.addFuel(6);
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.addFuel(3);
//        System.out.println(myCar.getCurrentFuelLevel());
        Car swift = new Car();
        swift.start();
        swift.addFuel(6);
       Car startedCar= swift.start();
        startedCar.drive();

        System.out.println("Min age of driving is "+ Driver.minAgeForDriving);
        Driver myDriver = new Driver();
        myDriver.name="yashasvi";
        myDriver.age=19;

        System.out.println("Is driver legal to drive "+myDriver.isAllowedToDrive());


    }
}
