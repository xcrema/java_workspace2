package stack;



import java.util.*;
class Solution{
	
	//@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- >0) {
			String input=sc.next();
			String [] ip = input.split("");
            Stack<String> st = new Stack<String>();
            boolean check = true;
            for(String str : ip) {
            	if(str.equals("(") || str.equals("{")|| str.equals("["))
            		st.push(str);
            	else if(str.equals(")") || str.equals("}") || str.equals("]")) {
            		if(st.isEmpty()) {
            			check = false;
            			break;
            		}
            		String temp = st.peek();
   
                    if(temp.equals("(") && !str.equals(")") ){
                        check = false;
                        break;
                    }
                    if(temp.equals("{") && !str.equals("}") ){
                        check = false;
                        break;
                    }if(temp.equals("[") && !str.equals("]") ){
                        check = false;
                        break;
                    }
                    st.pop();

            	}
            			
            }
            if(!st.isEmpty())
            	System.out.println("NO");
            else if(!check)
            	System.out.println("NO");
            else
            	System.out.println("YES");
		}
		
		sc.close();
	}
}



