import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int size = 5;

        arr = insertAtBeginning(arr, size, 90);
        size++;
        System.out.println("After insert at beginning: " + Arrays.toString(arr));

        arr = insertAtEnd(arr, size, 60);
        size++;
        System.out.println("After insert at end: " + Arrays.toString(arr));

        int position = 3;
        arr = insertAtPosition(arr, size, position, 40);
        size++;
        System.out.println("After insert at position " + position + ": " + Arrays.toString(arr));

        deleteAtBeginning(arr);


    }

    public static int[] insertAtBeginning(int[] arr, int size, int value) {
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
        return arr;
    }

    public static int[] insertAtEnd(int[] arr, int size, int value) {
        arr[size] = value;
        return arr;
    }

    public static int[] insertAtPosition(int[] arr, int size, int position, int value) {
        for (int i = size; i >= position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = value;
        return arr;
    }

    public static int[] deleteAtBeginning(int[] arr1)
    {
        int size = 0;
        for(int i = 0;i<arr1.length;i++){
            if (arr1[i] != 0) {
                size++;
            }
            else{
                break;
            }
        }

        for (int i = 0; i < size - 1; i++) {
            arr1[i] = arr1[i+1];
        }

        arr1[size - 1] = 0;

        System.out.println(Arrays.toString(arr1));
        return arr1;
    }
}
