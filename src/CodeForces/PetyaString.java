package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 16/10/17.
 */
public class PetyaString {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String first = reader.readLine().toLowerCase();
            String second = reader.readLine().toLowerCase();
            boolean isSame = false, isLess = false, isLarge = false;
            for(int i =0;i<first.length();i++){
                int f = (int) first.charAt(i);
                int s = (int) second.charAt(i);

                if(f == s) continue;
                if(f < s) {
                    isLess = true;
                    break;
                }
                if(f>s){
                    isLarge = true;
                    break;
                }
            }

            if(!isLarge && !isLess) isSame = true;

            if(isSame) System.out.println("0");
            else if(isLarge) System.out.println("1");
            else if(isLess) System.out.println("-1");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
