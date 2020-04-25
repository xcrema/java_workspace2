package red_black_trees;

class Node{
	int data;
	String color;
	Node left, right;
	Node(int data){
		this.data = data;
		this.color = "red";
		this.left = null;
		this.right = null;
	}
}

public class RedBlackTree {
	Node root = null;
	
	public static void main(String[] args) {
		RedBlackTree tree = new RedBlackTree();
		tree.root = tree.insert(tree.root, 9);  
        tree.root = tree.insert(tree.root, 5);  
        tree.root = tree.insert(tree.root, 10);  
        tree.root = tree.insert(tree.root, 0);  
        tree.root = tree.insert(tree.root, 6);  
        tree.root = tree.insert(tree.root, 11);  
        tree.root = tree.insert(tree.root, -1);  
        tree.root = tree.insert(tree.root, 1);  
        tree.root = tree.insert(tree.root, 2);
		
	}

	private Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		if(root == null)
			return new Node(data);
		
		if(data<root.data)
			root.left = insert(root.left, data);
		
		else if(data>root.data)
			root.right = insert(root.right, data);
		else
			return root;
		
		
	}
}
