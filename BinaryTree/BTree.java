// package BinaryTree;

import java.util.Queue;
import java.util.Stack;
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

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void iterativeInorder(Node node) {
        Node curr = node;
        Stack<Node> stack = new Stack<>();
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    public void iterativePreorder(Node node) {
        Node curr = node;
        Stack<Node> stack = new Stack<>();
        stack.push(curr);
        while (!stack.isEmpty()) {
            curr = stack.pop();
            System.out.println(curr.data + " ");

            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    public void levelOrder(Node node) {
        Node curr = node;
        Queue<Node> queue = new LinkedList<>();
        queue.add(curr);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
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

        // tree.inOrder(tree.root);
        // tree.iterativeInorder(tree.root);
        // tree.iterativePreorder(tree.root);
        // tree.levelOrder(tree.root);
        tree.postOrder(tree.root);
    }
}