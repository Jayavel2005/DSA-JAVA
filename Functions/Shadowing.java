package Functions;

public class Shadowing {
    static int x = 100;

    public static void main(String[] args) {
        System.out.println(x); // it prints 100 because the x is accessible to all methods within the class
                               // scope
        int x = 200; // Local variable with the same name as static variable x overlaps or hides the
                     // outer variable called shadowing
        System.out.println(x);
        foo();
    }

    static void foo(){
        System.out.println(x);
    }
}