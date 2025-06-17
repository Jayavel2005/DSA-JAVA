import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the Key Element: ");
        int key = scanner.nextInt();

        scanner.close();

        int index = binarySearch(array, key);
        System.out.printf("The key element %d founded at the index %d ", key, index);

    }
}