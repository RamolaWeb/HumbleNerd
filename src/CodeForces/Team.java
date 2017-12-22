package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 12/10/17.
 */
public class Team {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int noProblem = Integer.parseInt(reader.readLine());
            int count = 0;
            for(int i =0;i<noProblem;i++){
                String statusSolve [] = reader.readLine().split(" ");
                int hwSolve = 0;
                for(int j =0;j<3;j++){
                    int s = Integer.parseInt(statusSolve[j]);
                    if(s == 1) hwSolve++;
                }
                if(hwSolve >= 2) count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
