package top_view_of_tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;


class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;		
	}
}

public class Solution {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Node root = null;
		while(t-->0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		topView(root);
	}

	private static Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new Node(data);
		}
		else {
			Node cur;
			if(data<=root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			}else {
				cur = insert(root.right, data);
				root.right = cur;
			}
		}
		return root;
	}

	
	private static void topView(Node root) {
		
		class QueueObj{
			Node node;
			int hd;
		
			QueueObj(Node node, int hd){
				this.node = node;
				this.hd = hd;
			}
		}
		
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();
		
		if(root == null) {
			return;
		}
		else {
			q.add(new QueueObj(root, 0));
		}
		
		while(!q.isEmpty()) {
			
			QueueObj tempNode = q.poll();
			if(!topViewMap.containsKey(tempNode.hd)) {
				topViewMap.put(tempNode.hd, tempNode.node);
			}
			if(tempNode.node.left != null) {
				q.add(new QueueObj(tempNode.node.left, tempNode.hd));
			}
			if(tempNode.node.right != null) {
				q.add(new QueueObj(tempNode.node.right, tempNode.hd));
			}
		}
		for (Entry<Integer, Node> entry : topViewMap.entrySet()) { 
            System.out.print(entry.getValue().data); 
        } 
	}
}
