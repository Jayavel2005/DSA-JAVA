// // import java.util.*;

// // class CSE {
// //     public int fact(int n) {
// //         int count = 0;
// //         for (int i = 1; i <= n / 2; i++) {
// //             if (n % i == 0) {
// //                 count++;
// //             }

// //         }
// //         return count;
// //     }
// // }

// // public class Stacks {

// //     public static void main(String[] args) {
// //         int arr[] = { 8, 12, 16, 2, 3 };
// //         CSE cse = new CSE();

// //         for (int i = 0; i < arr.length; i++) {
// //             for (int j = 0; j < arr.length; j++) {
// //                 int val1 = cse.fact(arr[i]);
// //                 int val2 = cse.fact(arr[j]);
// //                 if (val1 > val2) {
// //                     int temp = arr[i];
// //                     arr[i] = arr[j];
// //                     arr[j] = temp;
// //                 }
// //             }
// //         }

// //         System.out.println(Arrays.toString(arr));
// //     }
// // }

// public class Stacks {

//     public static void main(String[] args) {
//         // int arr[] = { 1, 2, 3, 4, 5, 6 };
//         // int left = 0;
//         // int right = arr.length - 1;
//         // while (left <= right) {
//         // if (left == right) {
//         // System.out.print(arr[left] + " ");
//         // return;
//         // }
//         // System.out.print(arr[right] + " " + arr[left] + " ");
//         // left++;
//         // right--;

//         // }
//         // for (int i = 0; i < arr.length; i++) {
//         // for (int j = i + 1; j < arr.length; j++) {
//         // if (target == arr[i] + arr[j]) {
//         // System.out.println("[" + i + " " + j + "]");
//         // break;
//         // }
//         // }
//         // }
//         int arr[] = { 2, 5, 6, 10, 23, 44 };
//         int target = 44;
//         // int low = 0, high = arr.length - 1;
//         int low = 0, high = arr.length - 1;
//         while (low < high) {
//             int sum = arr[low] + arr[high];
//             if (sum == target) {
//                 System.out.println("Indices: " + low + ", " + high);
//                 break;
//             } else if (sum < target) {
//                 low++;
//             } else {
//                 high--;
//             }
//         }

//     }
// }
import java.util.*;;

public class arraysPro {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // Set<Integer> seen = new HashSet<>();
        // boolean hasDuplicate = false;

        // for (int k = i; k <= j; k++) {
        // if (!seen.add(arr[k])) {
        // hasDuplicate = true;
        // }
        // }
        // if (hasDuplicate) {

        // for (int k = i; k <= j; k++) {
        // System.out.print(arr[k] + " ");
        // }
        // System.out.println();
        // }
        // }
        // }
        // int target = 10;
        // for (int i = 0; i < arr.length; i++) {

        // for (int j = i; j < arr.length; j++) {

        // int sum = 0;
        // for (int k = i; k <= j; k++) {
        // sum += arr[k];
        // }
        // if (sum == target) {
        // for (int k = i; k <= j; k++) {
        // System.out.print(arr[k] + " ");
        // }
        // System.out.println();

        // }

        // }

        // int arr1[] = { 3, 4, 67, 2, 0, 3, 14, 0 };
        // int k = 0;
        // for (int i = 0; i < arr1.length; i++) {
        // if (arr1[i] != 0) {
        // arr1[k] = arr1[i];
        // k++;
        // }
        // }

        // while (k < arr1.length) {
        // arr1[k] = 0;
        // k++;

        // }

        // System.out.println(Arrays.toString(arr1));

        int arr2[] = { 1, 2, 3, 4, 2, 1, 4 };
        Arrays.sort(arr2);
        // int freq[] = new int[5];
        int count = 1;
        for (int i = 1; i < arr2.length - 1; i++) {
            if (arr2[i] == arr2[i - 1]) {
                count++;
            } else {
                System.out.println(arr2[i - 1] + " = " + count);
                count = 1;

            }
        }
        System.out.println(arr2[arr2.length - 1] + " = " + count);

    }

}