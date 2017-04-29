/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftleaningrbtree;

/**
 *
 * @author Ritesh
 * @param <K>
 * @param <V>
 */
public class LeftLeaningRBTree<K extends Comparable<K>, V> {
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	private Node root;

	private class Node {
		K key;
		V value;
		Node left;
		Node right;
		boolean color;
		int N;

		public Node(K key, V value, boolean color) {
			this.key = key;
			this.value = value;
			this.left = null;
			this.right = null;
			this.N = 1;
			//this can be hard-coded to RED as new node is always RED
			this.color = color; 
		}
	}

	public V get(K key) {
		return get(key, root);
	}

	private V get(K key, Node node) {
		int cmp = key.compareTo(node.key);
		if (cmp < 0)
			return get(key, node.left);
		if (cmp == 0)
			return node.value;
		return get(key, node.right);
	}

	private int sizeOf(Node node) {
		if (node == null)
			return 0;
		return node.N;
	}

	public void insert(K key, V value) {
		root = insert(key, value, root);
		root.color = BLACK;
	}

	private Node insert(K key, V value, Node node) {
		if (node == null)
			return new Node(key, value, RED);
		int cmp = key.compareTo(node.key);
		if (cmp == 0) {
			node.value = value; // update the value of an existing key
			return node;
		}
		if (cmp < 0)
			node.left = insert(key, value, node.left);
		else if (cmp > 0)
			node.right = insert(key, value, node.right);

		if (!isRed(node.left) && isRed(node.right))
			node = rotateLeft(node);
		if (isRed(node.left) && isRed(node.left.left))
			node = rotateRight(node);
		if (isRed(node.left) && isRed(node.right))
			node = flipColor(node);

		node.N = 1 + sizeOf(node.left) + sizeOf(node.right);
		return node;
	}

	private boolean isRed(Node node) {
		if (node == null)
			return false;
		return node.color == RED;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null)
			return -1;
		return 1 + Math.max(height(node.left), height(node.right));
	}

	@Override
	public String toString() {
		if (root == null)
			return "empty tree";
		return "root = " + root.key.toString() + " height = " + height();
	}

	private Node rotateLeft(Node node) {
		System.out.println("\trotate left");
		Node x = node.right;
		node.right = x.left;
		x.left = node;
		x.color = x.left.color;
		x.left.color = RED;
		x.N = node.N;
		node.N = sizeOf(node.left) + sizeOf(node.right) + 1;
		return x;
	}

	private Node rotateRight(Node node) {
		System.out.println("\trotate right");
		Node x = node.left;
		node.left = x.right;
		x.right = node;
		x.color = x.right.color;
		x.right.color = RED;
		x.N = node.N;
		node.N = sizeOf(node.left) + sizeOf(node.right) + 1;
		return x;
	}

	private Node flipColor(Node node) {
		System.out.println("\tflip color");
		node.color = !node.color;
		node.left.color = !node.left.color;
		node.right.color = !node.right.color;
		return node;
	}
}
