import java.util.*;

class Node{
	int key;
	Node left;
	Node right;
	Node(int key){
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of nodes in tree: ");
		int n = sc.nextInt();
		System.out.println("Enter elements in tree: ");
		Node root = null;
		for(int i=0; i<n; i++) {
			root = insert(root, sc.nextInt());
		}
		System.out.println("Inorder Trav: ");
		inorderTrav(root);
		System.out.println("\nEnter element to delete: ");
		int key = sc.nextInt();
		root = delete(root, key);
		System.out.println("Inorder Trav: ");
		inorderTrav(root);
		sc.close();
	}

	private static Node delete(Node root, int key) {
		// TODO Auto-generated method stub
		if(root == null)
			return null;
		
		if(root.key > key) {
			root.left = delete(root.left, key);
		}
		else if(root.key < key) {
			root.right = delete(root.right, key);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			if(root.right == null) {
				return root.left;
			}
			
			int value = minValue(root.right);
			root.key = value;
			root.right = delete(root.right, value);
			return root;
		}
		return root;
	}

	private static int minValue(Node node) {
		// TODO Auto-generated method stub
		int value = node.key;
		while(node.left != null) {
			value = node.left.key;
			node = node.left;
		}
		return value;
	}

	private static void inorderTrav(Node root) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		else {
			inorderTrav(root.left);
			System.out.print(root.key+" ");
			inorderTrav(root.right);
		}
	}

	private static Node insert(Node root, int key) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new Node(key);
		}
		else {
			if(root.key>key) {
				root.left = insert(root.left, key);
			}
			else if(root.key<key) {
				root.right = insert(root.right, key);
			}
		}
		return root;
	}
}
