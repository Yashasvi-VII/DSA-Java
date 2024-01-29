/*
sometimes there is logical error in code, like dividing a num with 0 or any value that will lead to code flow to end
then in java we need to catch the error exceptions using try catch block. If something went wrong it will execute catch
block other-wise.

we can have multiple catch blocks.

Whenever we have a parent and child exceptions make sure parent is at bottom Exceptions is parent class, This class
extends throwable class.

Which ends with able is actually interfaces

Exceptipons can be
1. Runtime exceptions
2. Sql exceptions
3. Io exceptions

*/



public class ExceptionHandling {
    public static void main(String[] args) {

        int i=0;
        int j=0;

        try{
            //write only critical conditions in try block.
            j=18/i;
        }
        catch (ArithmeticException e){
            //here we handle the exceptions
            System.out.println("Cannot divide by zero " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bound, "+" "+ e);
        }
        catch (Exception e)
        {
            // this is parent class of exception
            System.out.println("this is general exception handling");
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
