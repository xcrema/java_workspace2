package two_strings;

import java.util.Scanner;

public class Solution {
	
	static boolean commonStr(String str1, String str2) {
		
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str2.length(); j++)
				if(str1.charAt(i) == str2.charAt(j))
					return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			
			String str1 = sc.next();
			String str2 = sc.next();
			
			if(commonStr(str1, str2))
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		sc.close();
	}
}
