package rotate_array;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int []temp = new int[d];
		for(int i=0; i<d && i<n-1; i++) {
			temp[i] = arr[i];
		}		
		for(int i=0; i<n-d; i++)
			arr[i] = arr[i+d];
		
		for(int i=n-d, j=0; i<n && j<d; i++, j++)
			arr[i] = temp[j];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
