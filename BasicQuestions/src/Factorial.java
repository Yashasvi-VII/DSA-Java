import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter number:");
        int num = sc.nextInt();
       long ans= CalculateFactorial(num);
        System.out.println("Factorial of "+num+" is "+ans);
    }

    public static long CalculateFactorial(int num) {
        if(num==0){
            return 1;
        }
        return num*CalculateFactorial(num-1);
    }
}
