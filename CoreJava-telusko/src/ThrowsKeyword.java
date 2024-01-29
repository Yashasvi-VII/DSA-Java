/*
Catch is not a simple function which we can call, we have to use keyword called throw and we have to create object
of something like arithmetic exceptions (as this is class).

This will help when we are connecting with the database and connection is not established successfully and server throws
an error code so we can call another catch using object of that kind of exception.

We can also pass the message in the constructor of the object of exceptions.

Throw keyword basically throws the exceptions, and catch block will catch it.

We can also extends the Exceptions class to create custom exception.and if we are passing the message to the custom
exception then we have to pass that to the super class i.e. exceptions class which will take care of the message

Throws Keyword is different than throw keyword it is not plural of throw. Throws is used to throw the exception to the
class which is calling/using it.
 */

class YashasviExceptions extends Exception {
    public YashasviExceptions(String str) {
        super(str);
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            //write only critical conditions in try block.
            j = 18 / i;
            if (j == 0)
                // throw new ArithmeticException("I don't want to divide by zero.");
                throw new YashasviExceptions("Just testing the custom exceptions");
        } catch (ArithmeticException e) {
            //let's handle the exception using throw
            j = 18 / 1;
            System.out.println("That's the default output" + e);
        } catch (YashasviExceptions e) {
            System.out.println(e);
        } catch (Exception e) {
            // this is parent class of exception
            System.out.println("this is general exception handling");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
};
