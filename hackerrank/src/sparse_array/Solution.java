package sparse_array;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String a1[] = new String[n1];
		for(int i=0; i<n1; i++)
			a1[i] = sc.next();
		int n2 = sc.nextInt();
		String[] a2 = new String[n2];
		for(int i=0; i<n2; i++)
			a2 [i] = sc.next();
		
		for(int i=0; i<n2; i++) {
			int temp = 0;
			for(int j=0; j<n1; j++)
				if(a2[i].equals(a1[j]))
					temp++;
			System.out.println(temp);
		}
	}
}
