package avl_trees;

class Node{
	int key, height;
	Node left, right;
	
	Node(int key){
		this.key = key;
		height = 1;
	}
}

public class Solution {
	Node root;
	
	public static void main(String[] args) {
		Solution tree = new Solution();
		
		 tree.root = tree.insert(tree.root, 9);  
	        tree.root = tree.insert(tree.root, 5);  
	        tree.root = tree.insert(tree.root, 10);  
	        tree.root = tree.insert(tree.root, 0);  
	        tree.root = tree.insert(tree.root, 6);  
	        tree.root = tree.insert(tree.root, 11);  
	        tree.root = tree.insert(tree.root, -1);  
	        tree.root = tree.insert(tree.root, 1);  
	        tree.root = tree.insert(tree.root, 2);
        
        System.out.println("Preorder traversal" + 
                " of constructed tree is : "); 
        tree.preOrder(tree.root); 
        tree.root = tree.delete(tree.root, 10);
        System.out.println("");  
        System.out.println("Preorder traversal after "+  
                        "deletion of 10 :");  
        tree.preOrder(tree.root);
	}

	private Node delete(Node node, int key) {
		// TODO Auto-generated method stub
		if(node==null)
			return root;
		
		if(key<node.key)
			node.left = delete(node.left, key);
		else if(key>node.key)
			node.right = delete(node.right, key);
		
		else {
			if(node.left == null || node.right == null) {
				Node temp = null;
				if(temp == node.right)
					temp = node.left;
				else
					temp = node.right;
				
				if(temp == null) {
					temp = root;
					node = null;
				}
				else {
					node = temp;
				}
			}
			else {
				
				int value = minValue(node.right);
				node.key = value;
				node.right = delete(node.right, value);
			}
		}
		
		if(node == null)
			return node;
		
		node.height = Math.max(height(node.left), height(node.right))+1;
		
		int balance = getBalance(node);
		//LL case
		if(balance>1 && getBalance(node.left)>=0)
			return rightRotate(node);
		//LR
		if(balance >1 && getBalance(node.left) <0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		//RR
		if(balance<-1 && getBalance(node.right)<=0){
			return leftRotate(node);
		}
		if(balance<-1 && getBalance(node.right)>0) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	private int minValue(Node node) {
		// TODO Auto-generated method stub
		int value = node.key;
		while(node.left!=null) {
			value = node.left.key;
			node = node.left;
		}
		return value;
	}

	private Node insert(Node node, int key) {
		// TODO Auto-generated method stub
		if(node == null)
			return (new Node(key));
		
		if(key<node.key)
			node.left = insert(node.left, key);
		else if(node.key<key)
			node.right = insert(node.right, key);
		else
			return node;
		
		node.height = 1+Math.max(height(node.left), height(node.right));
		
		int balance = getBalance(node);
		
		//LL case
		if(balance>1 && key<node.left.key)
			return rightRotate(node);
		//RR case
		if(balance<-1 && key >node.right.key)
			return leftRotate(node);
		//LR case
		if(balance>1 && key>node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		//RL case
		if(balance<-1 && key<node.right.key) {
			node.right = rightRotate(node.left);
			return leftRotate(node);
		}
		return node;
	}
	void preOrder(Node node) { 
        if (node != null) { 
            System.out.print(node.key + " "); 
            preOrder(node.left); 
            preOrder(node.right); 
        } 
    } 
	private Node leftRotate(Node y) {
		// TODO Auto-generated method stub
		
		Node x = y.right;
		Node T2 = x.left;
		
		x.left = y;
		y.right = T2;
		
		x.height = Math.max(height(x.left), height(x.right))+1;
		y.height = Math.max(height(y.left), height(y.right))+1;
		
		return x;
	}

	private Node rightRotate(Node y) {
		// TODO Auto-generated method stub
		Node x = y.left;
		Node T2 = x.right;
		
		x.right = y;
		y.left = T2;
		
		y.height = Math.max(height(y.left), height(y.right)) +1 ;
		x.height = Math.max(height(x.left), height(x.right)) +1 ;
	
		return x;
	}

	private int getBalance(Node N) {
		// TODO Auto-generated method stub
		if(N==null)
			return 0;
		
		return height(N.left) - height(N.right);
	}

	private int height(Node N) {
		// TODO Auto-generated method stub
		if(N == null)
			return 0;
		
		return N.height;
	}
}
