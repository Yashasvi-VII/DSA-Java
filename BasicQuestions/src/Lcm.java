import java.util.Scanner;

class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter number1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number2:");
        int num2 = sc.nextInt();
        int ans = CalculateLcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + ans);
    }

    public static int CalculateLcm(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = i * first;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }
}
