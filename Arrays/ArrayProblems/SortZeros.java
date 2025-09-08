package Arrays.ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SortZeros {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // int n = in.nextInt();
        // int[] arr = new int[n];
        int[] arr = { 1, 2, 0, 0, 1, 2, 1, 0 };

        sortZeros(arr);
        System.out.println(Arrays.toString(arr));

        // in.close();

    }

    static void sortZeros(int[] arr) {
        int length = arr.length;
        int[] frequency = new int[3];

        for (int i = 0; i < length; i++) {
            frequency[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                arr[index++] = i;
            }

        }
    }
}