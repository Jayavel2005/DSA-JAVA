import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // for (int i = 5; i > 0; i--) {
        //     arr[i] = arr[i-1];
        // }

        //     arr[0] = 30;
        // System.out.println(Arrays.toString(arr));

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                size++;
            }
        }

        System.out.println(size);

        int position = 3;
        for(int i = size;i>=position;i--){
            arr[i] = arr[i-1];
        }

        arr[position - 1] = 40;
        size++;
        System.out.println(Arrays.toString(arr));
        



    }
}