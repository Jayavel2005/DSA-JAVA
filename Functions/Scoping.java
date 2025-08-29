package Functions;

public class Scoping {

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Jayavel");
        modify(string);
        System.out.println(string);
        {
            int c = 10;
            System.out.println(c);
        }
        int c = 20;

        {
            c = 100000;

        }
        System.out.println(c);
    }

    static void modify(StringBuilder string) {
        string.append(" Rocks");
    }
}