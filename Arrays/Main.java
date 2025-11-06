package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] evenArray = createEvenArray(in);
        int[] oddArray = createOddArray(in);
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));

    }

    static int[] createEvenArray(Scanner in) {
        System.out.print("Enter the size of the array: ");

        int size = in.nextInt();

        int[] arr = new int[size];

        int count = 0;
        int value = 0;
        while (count < size) {
            arr[value] = value * 2;
            count++;
            value++;
        }

        return arr;
    }

    static int[] createOddArray(Scanner in) {
        System.out.print("Enter the size of the array: ");

        int size = in.nextInt();

        int[] arr = new int[size];

        int count = 0;
        int value = 0;
        while (count < size) {
            arr[count] = value * 2 + 1;
            count++;
            value++;

        }

        return arr;
    }
}