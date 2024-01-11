import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter number:");
        int num = sc.nextInt();
        CalculateOddSum(num);
    }

    public static void CalculateOddSum(int num) {
        int i = 0;
        int sum = 0;
        while (i < num) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Odd number sum in range of 1 to " + num + " is " + sum);
    }
}
