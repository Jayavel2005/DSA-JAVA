import java.util.Scanner;

class Students {
    String  name;
    int rollNo;

    Students(String name , int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // int[] nums; //Array Declaration
        //int[] numbers = new int[5]; // Array Instantiation
        
        // int[] numbers = new int[] {1,2,3,4,5};


        // int[] nums = new int[5];

        // System.out.println("Enter the Array Elements: ");
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print("Enter the Value for index " + i + ":  ");
        //     nums[i] = scanner.nextInt();
        // }

        // for (int num : nums) {
        //     System.out.print(num + " ");
        // }

        Students[] students = new Students[3];


        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the Student Name : ");
            
            String userName = scanner.nextLine();
            System.out.print("Enter the Student Roll No : ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            students[i] = new Students(userName, rollNo);
        }

        for(Students student : students){
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Roll No: " + student.rollNo);
        }

        


        scanner.close();

    }
} 