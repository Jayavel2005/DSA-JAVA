import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char charcter = in.next().trim().charAt(0); 

        if (charcter >= 97 && charcter <= 122) {
            System.out.println("Lowercase");
        }

        if (charcter >= 65 && charcter <= 90) {
            System.out.println("Uppercase");
        }

    }
}