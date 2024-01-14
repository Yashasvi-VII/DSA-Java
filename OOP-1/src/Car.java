public class Car {
    //instance variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //instance methods
    public void drive(){
        System.out.println("Car drive");
        currentFuelInLiters--;
    }

    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
