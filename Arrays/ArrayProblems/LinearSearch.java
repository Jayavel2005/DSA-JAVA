package Arrays.ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array in sorted order either ascending or descending: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // System.out.print("Enter the key: ");
        // int key = in.nextInt();

        // System.out.println("The element " + key + " found at the index: " +
        // binarySearch(arr, key));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

        in.close();
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isDescending = arr[0] > arr[arr.length - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else {
                if (isDescending) {
                    if (key > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (key > arr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }

        return -1;
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
    