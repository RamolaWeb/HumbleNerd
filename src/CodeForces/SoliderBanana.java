package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class SoliderBanana {

    public static void main(String[] arg){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String [] parameterStringList = reader.readLine().split(" ");
            int k = Integer.parseInt(parameterStringList[0]);
            int n = Integer.parseInt(parameterStringList[1]);
            int w = Integer.parseInt(parameterStringList[2]);

            int moneyRequired = k * ((w*(w+1))/2);
            System.out.println(moneyRequired-n>0?moneyRequired-n:0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
