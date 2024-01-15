public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

  //  public void start() {
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

    public void drive() {
        System.out.println("Car drive");
        currentFuelInLiters--;
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}
