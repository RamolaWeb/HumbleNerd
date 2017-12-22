package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by sahil on 25/10/17.
 */
public class DreamoonStairs {

    public static void main(String[] arg){
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterString[] = reader.readLine().split(" ");
            double n = Double.parseDouble(parameterString[0]);
            double m = Double.parseDouble(parameterString[1]);
            if(n<m) {
                System.out.println("-1");

            }
            else {
            int k =(int) Math.ceil(n/(2.0d * m));
            int x = (int)n-k*(int)m;
            int y = 2*k*(int)m - (int) n;
            System.out.println(x+y);}

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
