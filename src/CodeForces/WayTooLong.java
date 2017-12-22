package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 12/10/17.
 */
public class WayTooLong {

    public static void main (String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            while(testCase-- >0){
                String w = reader.readLine().trim();
                int l = w.length();
                if(l > 10) {
                    String s = w.substring(0, 1);
                    String e = w.substring(l - 1);
                    System.out.println(s + (l - 2) + e);
                }
                else System.out.println(w);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
