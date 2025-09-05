package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionArr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr; // declaration

        arr = new int[5]; // initializaton of the object this will creates a new object in the heap;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            System.out.println(num);
        }

        in.close();
    }
}