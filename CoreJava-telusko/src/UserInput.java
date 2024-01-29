/*
println method belongs to printStream class to call println we should create a object of printStream, But in reality
object is already created 'out' object so out is the object of printStream and but this object is created as static
variable inside the system class and since it is static we can use out with the help of system class and once we have
access to out object we can call the println.

'In' is also a static method of type input stream inside System class

Buffer Reader is class that works with IO and is inside package.io(which needs to be explicitly import).We need to pass
object of the buffer reader
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput   {
    public static void main(String[] args) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
    }
}
