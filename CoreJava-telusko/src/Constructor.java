class Humandemo {
    private int age;
    private String name;

//    constructor syntax is similar to method, but only diffrence is constructor
//            does not have return type.And constructor name should be same as class name
    public Humandemo(){
        // Every time we create an object, constructor will be called.
        System.out.println("in constructor");

        // we can assign values to instance variables in constructor
        age=11;
        name="yashasvi";

        //There is a convention when ever you are doing an operation
        // like assigning a value or calculation always do it in method
        // never do inline operations.

        //When we are making a connection with the dataBase or network
        // we can write the connection in the constructor

    }


    //Getter method to fetch age
    public int getAge() {
        return age;
    }

    //Getter method to fetch name
    public String getName() {
        return name;
    }

    //Setter method to set age
    public void setAge(int age){
        //this refers to current object who is calling the set age
        this.age=age;
    }

    //Setter method to set name
    public void setName(String name){
        this.name=name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Humandemo obj = new Humandemo();
//        obj.age = 11;
//        obj.name = "yashasvi";

//        obj.setAge(11);
//        obj.setName("yashasvi");
        System.out.println(obj.getName() + " "+ obj.getAge());
    }
}

