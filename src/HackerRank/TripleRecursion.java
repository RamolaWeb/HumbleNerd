package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 14/11/17.
 */
public class TripleRecursion {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int n = Integer.parseInt(parameterStringList[0]);
            int m = Integer.parseInt(parameterStringList[1]);
            int k = Integer.parseInt(parameterStringList[2]);
            int matrix[][] = new int[n][n];
            matrix[0][0] = m;
            for(int i = 0;i<n;i++){
                for(int j=0;j<n;j++){

                    if( i == 0 && j == 0 ){
                        matrix[i][j] = m;
                    }
                  else if(i == j){
                        matrix[i][j] = matrix[i-1][j-1] + k;
                    }
                    else if(i < j){
                        matrix[i][j] = matrix[i][j-1] -1;
                    }
                    else if (i > j){
                        matrix[i][j] = matrix[i-1][j] - 1;
                    }
                }
            }

            for(int i =0 ;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(matrix[i][j] +" ");
                }
                System.out.println("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
