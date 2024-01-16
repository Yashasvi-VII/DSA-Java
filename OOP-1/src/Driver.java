// Declaring and using objects
public class Driver {

    static int minAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicence;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {

        Car swift = new Car("White");
        Car thar = new Car();

//        swift.start();
//        swift.addFuel(6);
//        Car startedCar = swift.start();
//        startedCar.drive();
        swift.start().drive();
        System.out.println("color of car is "+swift.color);

        System.out.println("Min age of driving is " + Driver.minAgeForDriving);
        Driver myDriver = new Driver();
        myDriver.name = "yashasvi";
        myDriver.age = 19;

        System.out.println("Is driver legal to drive " + myDriver.isAllowedToDrive());

        System.out.println("Thar color is "+thar.color);
    }
}
