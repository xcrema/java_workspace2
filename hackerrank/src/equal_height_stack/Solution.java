package equal_height_stack;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
	static boolean equalHeight(int sumh1, int sumh2, int sumh3) {
		if(sumh1 == sumh2 && sumh1 == sumh3)
			return true;
		else
			return false;
	}
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
		int sumh1 = 0, sumh2 = 0, sumh3 = 0;
		
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();

		for(int i=h1.length-1; i>=0; i--) {
			sumh1+=h1[i];
			stack1.push(h1[i]);
		}
		for(int i=h2.length-1; i>=0; i--) {
			sumh2+=h2[i];
			stack2.push(h2[i]);
		}
		for(int i=h3.length-1; i>=0; i--) {
			sumh3+=h3[i];
			stack3.push(h3[i]);
		}
		
		int min = Math.min(Math.min(sumh1, sumh2), sumh3);
		while(min>0) {
			
			if(sumh1 != min) {
				sumh1 = sumh1 - stack1.pop();
				if(min > sumh1)
					min = sumh1;
			}
			if(equalHeight(sumh1, sumh2, sumh3))
				break;
			if(sumh2 != min) {
				sumh2 = sumh2 - stack2.pop();
				if(min > sumh2)
					min = sumh2;
			}
			if(equalHeight(sumh1, sumh2, sumh3))
				break;
			if(sumh3 != min) {
				sumh3 = sumh3 - stack3.pop();
				if(min > sumh3)
					min = sumh3;
			}
			if(equalHeight(sumh1, sumh2, sumh3))
				break;
		}
		if(min<=0)
			return 0;
    	return sumh1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();
    }
}
