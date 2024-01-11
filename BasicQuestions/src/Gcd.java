import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter number1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number2:");
        int num2 = sc.nextInt();
        int ans = CalculateGcd(num1, num2);
        System.out.println("Gcd of " + num1 + " and " + num2 + " is " + ans);
    }

    public static int CalculateGcd(int first, int second) {
        int i = 2;
        int gcd = 1;
        int least = least(first, second);
        while (i <= least) {
            if ((first % i == 0) && (second % i == 0)) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int first, int second) {
        if (first < second) {
            return first;
        }
        return second;
    }
}
