package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 25/10/17.
 */
public class Rewards {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String cupStringList[] = reader.readLine().split(" ");
            double a1 = Integer.parseInt(cupStringList[0]);
            double a2 = Integer.parseInt(cupStringList[1]);
            double a3 = Integer.parseInt(cupStringList[2]);
            String medalStringList[] = reader.readLine().split(" ");
            double b1 = Integer.parseInt(medalStringList[0]);
            double b2 = Integer.parseInt(medalStringList[1]);
            double b3 = Integer.parseInt(medalStringList[2]);
            int k = (int) (Math.ceil((a1+a2+a3)/5.0) + Math.ceil((b1+b2+b3)/10.0));
            int n = Integer.parseInt(reader.readLine());
            if(k<=n) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
