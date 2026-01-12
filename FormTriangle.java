// import java.util.Arrays;

// public class ChocoLate {

//     public static void main(String[] args) {
//         int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
//         int m = 9;

//         Arrays.sort(arr);

//         if (arr.length < m) {
//             System.out.println(-1);
//             return;
//         }

//         int minimalDiff = Integer.MAX_VALUE;

//         for (int i = m - 1; i < arr.length; i++) {
//             int diff = arr[i] - arr[i - (m - 1)];
//             minimalDiff = Math.min(minimalDiff, diff);
//         }

//         System.out.println(minimalDiff);
//     }
// }
// import java.util.*;

// public class FormTriangle {
//     public static void main(String[] args) {
//         int[] arr = { 10, 21, 22, 100, 101, 200, 300 };
//         int count = 0;
//         for (int i = 0; i < arr.length - 2; i++) {
//             for (int j = i + 1; j < arr.length - 1; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     if (arr[i] + arr[j] > arr[k]) {
//                         count++;
//                     }
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }






