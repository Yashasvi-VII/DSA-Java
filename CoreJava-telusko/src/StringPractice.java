public class StringPractice {
    public static void main(String[] args) {
//        String name = new String("yashasvi");
        String name="yashasvi";
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello "+name);

        // To check character at any index
        System.out.println("character at index 0 is "+name.charAt(0));

        //Concatenate two strings
        System.out.println(name.concat(" is learning java"));
    }
}
