package queue_using_two_stacks;

import java.util.*;

public class Solution {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void  enqueue(int x) {
		stack1.push(x);
	}
	
	public static void dequeue() {
		if(stack1.isEmpty() && stack2.isEmpty())
			return;
		int size = stack1.size();
		if(stack2.isEmpty()) {
			while(size-- > 0) {
				stack2.push(stack1.pop());
			}
		}
		stack2.pop();
	}
	
	public static void display() {
		if(stack1.isEmpty() && stack2.isEmpty())
			System.out.println("");
		if(!stack2.isEmpty())
			System.out.println(stack2.peek());
		else {
			int size = stack1.size();
			while(size-- > 0) {
				stack2.push(stack1.pop());
			}
			System.out.println(stack2.peek());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int option = sc.nextInt();
			
			if(option == 1) {
				int x = sc.nextInt();
				enqueue(x);
			}
			if(option == 2) {
				dequeue();
			}
			if(option == 3) {
				display();
			}
		}
		sc.close();
	}
}
