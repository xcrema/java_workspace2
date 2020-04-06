package problem2;

import java.util.Scanner;

public class CandidateCode {
	
	static int[] bubbleSort(int []arr) {
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
        return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t>=1 && t<=100000) {
			for(int i=0; i<t; i++) {
				
				int n = sc.nextInt();
				int [] a1 = new int[n];
				
				for(int j=0; j<n; j++)
					a1[j] = sc.nextInt();
				
				int [] a2 = new int[n];
				
				for(int j=0; j<n; j++)
					a2[j] = sc.nextInt();
				
				a1 = bubbleSort(a1);
				a2 = bubbleSort(a2);
				
				int count = 0, j;
				for(j=0; j<n; j++) {
					if(a1[j]>a2[j])
						count++;
					else {
						for(int k=j; k<n; k++) {
							if(a1[k]>a2[j] && a1[k]!=Integer.MIN_VALUE) {
								a1[k] = Integer.MIN_VALUE;
								count++;
							}
						}
						
					}
				}
				System.out.println(count);

					
			}
		}
		sc.close();
	}
}
