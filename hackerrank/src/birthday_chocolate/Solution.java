package birthday_chocolate;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthday function below.
    static int birthday(int [] s, int d, int m) {
    	int count=0;
    	for(int i=0; i<=s.length-m; i++) {
    		int temp = 0;
    		for(int j=i; j<i+m; j++) {
    			temp+=s[j];
    		}
    		if(temp == d)
    			count++;
    	}
    	return count;
    }

    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0; i<n; i++)
    	   arr[i] = sc.nextInt();
       int d = sc.nextInt();
       int m = sc.nextInt();
       System.out.println(birthday(arr, d, m));
       sc.close();
    }
}
