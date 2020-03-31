package hour_glass_2darray;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        
        int [][] hg = new int[4][4];
        int sum = 0;
        for(int i=0; i<4; i++){
            
            for(int j=0; j<4; j++){
                for(int k=j; k<j+3; k++){
                    sum+=arr[i][k];
                }
                    
                sum+=arr[i+1][j+1];

                for(int k=j; k<j+3; k++){
                    sum+=arr[i+2][k];
                }

                hg[i][j] = sum;
                sum = 0;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<4; i++)
            for(int j=0; j<4; j++)
                if(max<hg[i][j])
                    max = hg[i][j];

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

