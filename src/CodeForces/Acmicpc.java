package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 23/12/17.
 */
public class Acmicpc {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String scoreStringList[] = reader.readLine().split(" ");
            int score[] = new int[6];
            int totScore = 0;
            for(int i=0;i<6;i++){
                int c = Integer.parseInt(scoreStringList[i]);
                totScore += c;
                score[i] = c;
            }

            if(totScore % 2 !=0){
                System.out.println("NO");
                return;
            }
            int reqSum = totScore/2;


            for(int i=0;i<6;i++){
                for(int j=i+1; j<6;j++){
                    for(int k = j+1;k<6;k++){
                        if((score[i] + score[j]+ score[k]) == reqSum ){
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }

            System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
