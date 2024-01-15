public class Car {
    //instance variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //instance methods
    public void drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLiters<=5){
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLiters--;
        }else{
            System.out.println("Car drive");
            currentFuelInLiters--;
        }
    }
    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
