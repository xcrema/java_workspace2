package string_tokens;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
		if (s.length() == 0) {
			System.out.println("0");
		}
		if (s.length() >= 1 && s.length() <= 400000) {
			//String[] str = s.split("[A-Za-z !,?._'@]+");
			
			System.out.println(s);
			String[] str = s.split("[!@,? '._]+");
			System.out.println(str.length);
			for (String word : str) {
				System.out.println(word);
			}
		}
		sc.close();
	}
}
