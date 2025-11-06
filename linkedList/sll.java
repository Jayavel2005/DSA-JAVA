import java.util.*;

// Node creation
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Create a new node and add it to the end
    public void create(int data) {  // fixed typo from 'creae' → 'create'
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Insert node at the beginning
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        display();
    }

    // Display all nodes
    public void display() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(); // add newline after printing
    }

    // Insert node at the end
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove the first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        head = head.next;
    }

    // Remove the last node
    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Insert node at specific position
    public void insertAtPosition(Scanner in) {
        System.out.print("Enter the position to insert (position starts from 1): ");
        int pos = in.nextInt();
        System.out.print("Enter the data to insert: ");
        int data = in.nextInt();

        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (pos == 1) {
            insertAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
}

// Main class must be outside LinkedList
public class sll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList ll = new LinkedList();

        System.out.print("Enter the number of nodes to insert: ");
        int n = in.nextInt();

        System.out.println("Enter the data for " + n + " nodes:");
        for (int i = 0; i < n; i++) {
            ll.create(in.nextInt());
        }

        System.out.println("\nInitial LinkedList:");
        ll.display();

        ll.insertAtPosition(in);
        System.out.println("\nAfter inserting at position:");
        ll.display();

        in.close();
    }
}
