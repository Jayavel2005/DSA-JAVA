import java.util.Scanner;;

public class OrderAgnosticBS {

    public static int AgnosticBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        boolean isAscending = arr[low] < arr[high];

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (isAscending) {
                if (key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
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

        int index = AgnosticBinarySearch(array, key);
        System.out.printf("The key element %d founded at the index %d ", key, index);

    }
}