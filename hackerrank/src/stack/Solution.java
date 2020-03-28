package stack;

import java.util.*;
class Solution{
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			String [] ip = input.split("");
            Stack st = new Stack();
            boolean check = true;
            for(String str : ip) {
            	if(str.equals("(") || str.equals("{")|| str.equals("["))
            		st.push(str);
            	else if(str.equals(")") || str.equals("}") || str.equals("]")) {
            		if(st.isEmpty()) {
            			check = false;
            			break;
            		}
            		st.pop();
            	}
            			
            }
            if(!st.isEmpty())
            	System.out.println("false");
            else if(!check)
            	System.out.println("false");
            else
            	System.out.println("true");
		}
		
		sc.close();
	}
}



