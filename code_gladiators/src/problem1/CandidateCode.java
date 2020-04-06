package problem1;

/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here

   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   if(n>=1 && n<=10000000) {
	   long a1[] = new long[n];
	   for(int i=0; i<n; i++)
		   a1[i] = sc.nextLong();
	   long a2[] = new long[n];
	   for(int i=0; i<n; i++) 
		   a2[i] = sc.nextLong();
	   
	   long min = Long.MAX_VALUE;
	   for(int i=0; i<n; i++) {
		   if(min>a2[i]/a1[i])
			   min = a2[i]/a1[i];
	   }
	   System.out.println(min);
   }
   sc.close();
   }
}