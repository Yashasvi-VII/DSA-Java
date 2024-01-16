public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

  static  int noOfCarsSold;

    static{
        noOfCarsSold=0;
        System.out.println("I am in static block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in initialization block");

    }

    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, cannot start");
        } else if (currentFuelInLiters <= 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car started!!");
        }

        //returing car, i.e. current object
        return this;
    }

    //Constructor Chaining
    // Parameterized constructor
    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 220;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    // Default constructor
//    Car() {
//        noOfWheels = 4;
//        color = "black";
//        maxSpeed = 220;
//        currentFuelInLiters = 2;
//        noOfSeats = 5;
//    }

    Car() {
        this("Black");
        currentFuelInLiters = 5;
    }

    public void drive() {
        System.out.println("Car drive");
        currentFuelInLiters--;
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}
