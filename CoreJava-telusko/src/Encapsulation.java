class Human {

//     this age variable is only accessible
//     from this class. Every time you create an instance
//    variable make it private.and to access this data/variables make methods
//    and by this we achieved encapsulation in human class
    private int age;
    private String name;

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

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.age = 11;
//        obj.name = "yashasvi";

        obj.setAge(11);
        obj.setName("yashasvi");
        System.out.println(obj.getName() + " "+ obj.getAge());
    }
}
