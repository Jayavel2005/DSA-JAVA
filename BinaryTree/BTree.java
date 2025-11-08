// package BinaryTree;

import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTreeImp {
    Node root;

    public void createTree(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = new Node(data);
                break;
            } else {
                queue.add(current.left);

            }

            if (current.right == null) {
                current.right = new Node(data);
                break;
            } else {
                queue.add(current.right);

            }

        }
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);

    }
}

public class BTree {
    public static void main(String[] args) {
        BinaryTreeImp tree = new BinaryTreeImp();
        System.out.println("Enter how many nodes to create: ");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the node value: ");
            int data = new java.util.Scanner(System.in).nextInt();
            tree.createTree(data);
        }

        tree.inOrder(tree.root);
    }
}