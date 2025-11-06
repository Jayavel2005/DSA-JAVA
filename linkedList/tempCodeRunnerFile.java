}

class LinkedList {

    Node head;

    public void creae(int data) {
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

    public void insertAtFirst(Scanner in) {
        in.nextLine();
        System.out.println("Enter the data to insert at first: ");
        int data = in.nextInt();
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        this.display();
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }

    public void insertAtLast(Scanner in) {
        System.out.println("Enter the data to insert at last: ");

        int data = in.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            this.creae(data);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        temp = newNode;
        this.display();
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
        }
        this.display();
    }
}

public class sll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // number of nodes to insert
        System.out.println("Enter the number of nodes to insert: ");
        int n = in.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            ll.creae(data);
        }
        // linkedlist display;
        ll.display();
        // in.nextLine(); // linkedlist insert at first
        // ll.insertAtFirst(in);
        // ll.insertAtLast(in);
        // in.nextLine();