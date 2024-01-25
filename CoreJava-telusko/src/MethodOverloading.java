class HumanDemo2 {
    private int age;
    private String name;

    //Non parameterized or default constructor
    public HumanDemo2() {
        age = 11;
        name = "yashasvi";
    }

    //Parameterized constructor
    public HumanDemo2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        HumanDemo2 obj = new HumanDemo2();
        HumanDemo2 obj1 = new HumanDemo2(11, "yashasvi");

        System.out.println(obj1.getName() + " " + obj1.getAge());
    }
}
