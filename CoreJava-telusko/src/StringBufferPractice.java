
public class StringBufferPractice {
    public static void main(String[] args) {

        //String buffer is actually a string which is mutable
        // It will give a buffer size of 16 bits
    StringBuffer sb= new StringBuffer("yashasvi");

    // printing capacity of string buffer
        System.out.println(sb.capacity());

    //Length and capacity is different
        System.out.println(sb.length());
    }
}
