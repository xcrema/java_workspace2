
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		int s = sc.nextInt();
		
		String [] arr = new String[s];
		
		for(int i=0; i<s; i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<s; i++) {
			int max = i;
			for(int j=i+1; j<s; j++) {
				HashSet<Object> set1 = new HashSet<Object>();
				HashSet<Object> set2 = new HashSet<Object>();
				String []s1 = arr[max].split("");
				String []s2 = arr[j].split("");
				for(String st:s1)
					set1.add(st);
				for(String st:s2)
					set2.add(st);
				
				//System.out.println(set1.size());
				//System.out.println(set2.size());
				if(set1.size() < set2.size())
					max = j;
			}
			System.out.println(max);
			String temp = arr[max];
			for(int j=max; j>i; j--)
				arr[j] = arr[j-1];
			
			arr[i] = temp;
			
		}
		
		for(int i=0; i<s; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		String st = sc.next();
		String [] str = st.split("");
		HashSet<Object> set1 = new HashSet<Object>();
		for(String s:str)
			set1.add(s);
		System.out.println(set1);
		*/
		sc.close();
	}
}
