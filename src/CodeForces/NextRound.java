package CodeForces;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 12/10/17.
 */
public class NextRound {

    public static void main (String [] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String [] parameterStringList = reader.readLine().split(" ");
            int n = Integer.parseInt(parameterStringList[0]);
            int k = Integer.parseInt(parameterStringList[1]);
            String scoreStringList [] = reader.readLine().split(" ");
            int score[] = new int[n];
            for(int i =0;i<n;i++)
                score[i] = Integer.parseInt(scoreStringList[i]);
            int count =0;
            for(int i =0;i<n;i++)
                if((score[i] > 0)&&(score[i]>=score[k-1]))
                    count++;
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
