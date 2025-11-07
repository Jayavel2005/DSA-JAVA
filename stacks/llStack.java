// // package stacks;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedListStack {
//     Node top;

//     public void push(int data) {
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//     }

//     public int pop() {
//         if (top == null) {
//             System.out.println("Stack underflow");
//             return -1;
//         }
//         int data = top.data;
//         top = top.next;
//         return data;
//     }

//     public int peek() {
//         if (top == null) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return top.data;

//     }

//     public void isEmpty() {
//         if (top == null) {
//             System.out.println("Stack is empty");
//         } else {
//             System.out.println("Stack is not empty");
//         }

//         return;
//     }

//     public void display() {
//         Node temp = top;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }

// public class llStack {

//     public static void main(String[] args) {
//         LinkedListStack st = new LinkedListStack();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.display();
//     }
// }

// package stacks;

public class llStack {

    public static void main(String[] args) {
        String str = "I Love Programming";
        String splitString = "";
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                splitString += ch;
            } else {
                result = splitString + " " + result;
                splitString = "";
            }
        }

        System.out.println(splitString + " " + result);

    }
}