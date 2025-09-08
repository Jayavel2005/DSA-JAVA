package Arrays.ArrayProblems;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n - 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(missingNumber(arr));

        in.close();

    }

    static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;

        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        return sum - arraySum;
    }

}