package simple_class_editor;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			int choice = sc.nextInt();
			
			if(choice == 1) {
				if(stack.isEmpty())
					stack.push(sc.next());
				else {
					String str = stack.peek();
					
					str = str+sc.next();
					stack.push(str);
				}
			}
			if(choice == 2) {
				int k = sc.nextInt();
				String temp = stack.peek();
				String str = "";
				for(int i=0; i<temp.length()-k; i++) {
					str = str+temp.charAt(i);
				}
				stack.push(str);
			}
			if(choice == 3) {
				int k=sc.nextInt();
				String temp = stack.peek();
				System.out.println(temp.charAt(k-1));
			}
			if(choice == 4) {
				stack.pop();
			}
			
		}
		sc.close();
	}
}
