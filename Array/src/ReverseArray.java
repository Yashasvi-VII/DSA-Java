import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements of array");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Elements of array are:- ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        ReverseArray.reverse(array, size);

        System.out.print("Elements after reversing array are:- ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

