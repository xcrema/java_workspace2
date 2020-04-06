package game_of_two_stacks;
/*
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    static int twoStacks(int x, int[] a, int[] b) {
     
    	int result = 0, count = 0;
    	
    	Stack<Integer> stack1 = new Stack<Integer>();
    	Stack<Integer> stack2 = new Stack<Integer>();
    	//System.out.println(a.length);
    	for(int i=(a.length)-1; i>=0; i--) {
    		int temp = a[i];
    		stack1.push(temp);
    	}
    	
    	for(int i=(b.length)-1; i>=0; i--)
    		stack2.push(b[i]);
    	
    	while(true) {
    		if(stack1.isEmpty() || stack2.isEmpty())
    			break;
    		if(stack1.peek() < stack2.peek()) {
    			if(result+stack1.peek()<=x) {
    				result+=stack1.pop();
    				count++;
    			}
    			else
    				break;
    		}
    		else {
    			if(result+stack2.peek()<=x) {
    				result+=stack2.pop();
    				count++;
    			}
    			else
    				break;
    		}
    	}
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            System.out.println(result);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();
    }
}
*/

//CORRECT SOLUTION

/*
#include <bits/stdc++.h>

using namespace std;

int main(){ 
    int g;
    cin >> g;    
    for(int a0 = 0; a0 < g; a0++){
        int n;
        int m;
        int x;
        cin >> n >> m >> x;
        
        vector<int> a(n);
        for(int a_i = 0; a_i <n; a_i++){
           cin >> a[a_i];
        }
        
        vector<int> b(m);
        for(int b_i =0; b_i <m; b_i++){
           cin >> b[b_i];
        }
        
        int sum=0,count=0,temp=0,i=0,j=0;        
        
        while(i<n && sum+a[i]<=x){    //considering only first stack and calculating count
            sum+=a[i];
            i++;
        }
        count=i;        
       
        while(j<m && i>=0){          //now adding one element of second stack at a time and subtracting the top element of first stack and calculating the count   
            sum+=b[j];             
            j++;
            while(sum>x && i>0){
                i--;
                sum-=a[i];
            }
            if(sum<=x && i+j>count)
                count=i+j;
        }
        cout<<count<<endl;
    } 
    return 0;
}
*/









