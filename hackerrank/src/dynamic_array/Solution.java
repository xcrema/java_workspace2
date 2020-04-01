package dynamic_array;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static void dynamicArray(int n, ArrayList<ArrayList<Integer>> queries) {
    // Write your code here
        int lastAnswer = 0;
        List<List<Integer>> seqList = new ArrayList<List<Integer>>(n);
        for(int i=0; i<n; i++)
        	seqList.add(new ArrayList<Integer>());
        
        for(int i=0; i<queries.size(); i++){
            if((queries.get(i)).get(0) == 1){

                int seq = ((queries.get(i)).get(1)^lastAnswer)%n;
                int temp = (queries.get(i)).get(2);
                seqList.get(seq).add(temp);
            	
            }
            else{
                int seq = ((queries.get(i)).get(1)^lastAnswer)%n;
                int temp = (queries.get(i)).get(2) % (seqList.get(seq)).size();
                lastAnswer = (seqList.get(seq)).get(temp);
                System.out.println(lastAnswer);
            	//System.out.println(seq);
            }
            
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int q = sc.nextInt();
    	
    	ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();

    	//queries.add(new ArrayList<Integer>(q));
    	for(int i=0; i<q; i++)
    		queries.add(new ArrayList<Integer>());
    	
    	for(int i=0; i<q; i++) {
    		for(int j=0; j<3; j++)
    			queries.get(i).add(j, sc.nextInt());
    	}
    	
    	Result.dynamicArray(n, queries);
    	sc.close();
    }
}
