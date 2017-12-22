package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 1/11/17.
 */
public class CrazyComputer {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int n = Integer.parseInt(parameterStringList[0]);
            int noOfWord = 1;
            int c = Integer.parseInt(parameterStringList[1]);
            String numberStringList[] = reader.readLine().split(" ");
            int time[] = new int[n];
            for(int i=0;i<n;i++){
                time[i] = Integer.parseInt(numberStringList[i]);
            }

            for(int i=0;i<time.length-1;i++){
                if(time[i+1] - time[i] <=c) noOfWord +=1;
                else noOfWord = 1;
            }

            System.out.println(noOfWord);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
