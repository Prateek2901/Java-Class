/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package avl;

import java.util.Scanner;

/**
 *
 * @author prateek
 */
class Node {

    int data, height;
    Node right, left;

    public Node(int d) {
        data = d;
        height = 1;
    }

    Node() {
    }
}

class AVL {

    Node root;

    public Node create(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        if (x > root.data) {
            root.right = create(root.right, x);
        } else if (x <= root.data) {
            root.left = create(root.left, x);
        } else {
            return root;
        }

        root.height = (max(height(root.left), height(root.right)) + 1);
        int B = (height(root.left) - height(root.right));
        if (B > 1 && x > root.left.data) {
            root.left = left_rotate(root.left);
            return right_rotate(root);
        }
        if (B > 1 && x < root.left.data) {
            return right_rotate(root);
        }
        if (B < -1 && x > root.right.data) {
            return left_rotate(root);
        }
        if (B < -1 && x < root.right.data) {
            root.right = right_rotate(root.right);
            return left_rotate(root);
        }
        return root;
    }

    public Node right_rotate(Node root) {
        Node n1, n2;
        n1 = root.left;
        n2 = n1.right;
        n1.right = root;
        root.left = n2;
        n1.height = (max(height(n1.left), height(n1.right)) + 1);
        root.height = max(height(root.left), height(root.right) + 1);
        return n1;
    }

    public Node left_rotate(Node root) {
        Node n1, n2;
        n1 = root.right;
        n2 = n1.left;
        n1.left = root;
        root.right = n2;
        n1.height = (max(height(n1.left), height(n1.right)) + 1);
        root.height = (max(height(root.left), height(root.right)) + 1);
        return n1;
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public void display(Node root) {
        Node p = root;
        if (root == null) {
            return;
        }
        display(root.left);
        if (root.data != 0) {
            System.out.println(root.data);
        }
        display(root.right);
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {

        AVL t = new AVL();
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();;
        while (d != -1) {
            t.root = t.create(t.root, d);
            d = s.nextInt();
        }
        System.out.println("AVL TREE OUTPUT");
        t.display(t.root);
    }
}
