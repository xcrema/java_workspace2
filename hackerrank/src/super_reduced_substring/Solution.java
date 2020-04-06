package super_reduced_substring;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        String[] st = s.split("");
        Stack<String> stack = new Stack<String>();
        for(int i=0; i<st.length; i++) {
        	if(stack.isEmpty())
        		stack.push(st[i]);
        	else if(stack.peek().equals(st[i]))
        		stack.pop();
        	else
        		stack.push(st[i]);
        }
        String str = new String();
        while(!stack.isEmpty())
        	str = stack.pop()+str;
        return str;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = superReducedString(str);
        if(!s.isEmpty())
        	System.out.println(s);
        else
        	System.out.println("Empty String");
        sc.close();
    }
}
