import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int ans = CalculateDigitSum(num);
        System.out.println("Sum of digits of " + num + " is " + ans);
    }

    public static int CalculateDigitSum(int num) {
        if (num < 10) {
            return num;
        }
        int ans = 0;
        while (num > 0) {
            int temp = num % 10;
            ans += temp;
            num /= 10;
        }
        return ans;
    }
}
