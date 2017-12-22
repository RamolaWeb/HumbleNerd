package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 24/10/17.
 */
public class Translation {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String first = reader.readLine();
            String second = reader.readLine();
            boolean isEligible = true;

            for(int i=0, j=second.length()-1;i<first.length() && j>=0;i++,j--){
                if(!first.substring(i,i+1).equals(second.substring(j,j+1))) isEligible = false;
            }

            if(isEligible) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
