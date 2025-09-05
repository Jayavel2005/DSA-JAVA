package Arrays;

import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);
        arr.add(40);
        arr.add(45);
        arr.add(50);
        System.out.println(arr.subList(0, 4));
    }
}