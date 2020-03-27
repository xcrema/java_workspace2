package subarray;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n; j++) {
				int sum = 0;
				for(int k=j; k<i; k++) {
					sum+=arr[k];
				}
				if (sum<0) {
					count+=1;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
