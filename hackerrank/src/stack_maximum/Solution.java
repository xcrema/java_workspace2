package stack_maximum;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	
	static Stack<Integer> stack = new Stack<Integer>();
	static int max;
	public static void stack_push(int x) {
		if(stack.isEmpty()) {
			stack.push(x);
			max = x;
		}
		else {
			if(x<max)
				stack.push(x);
			else {
				//2*x – maxEle
				stack.push(x*2-max);
				max = x;
			}
		}
	}
	public static void stack_pop() {
		if(stack.peek()>=max){
			int ele = stack.pop();
			max = 2*max - ele;
		}
		else {
			stack.pop();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int type = sc.nextInt();
			if(type == 1) {
				int x = sc.nextInt();
				stack_push(x);
			}
			if(type == 2) {
				stack_pop();
			}
			if(type == 3) {
				System.out.println(max);
			}
		}
		sc.close();
	}
}
