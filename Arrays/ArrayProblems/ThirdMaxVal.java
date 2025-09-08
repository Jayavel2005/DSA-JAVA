package Arrays.ArrayProblems;

import java.util.Scanner;

public class ThirdMaxVal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(thirdMaxVal(arr));

        in.close();
    }

    static int thirdMaxVal(int[] arr) {

        if (arr.length < 3) {
            return -1;
        }

        int first = -1, second = -1, third = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] >= second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] >= third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        return third;

    }
}