package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class HQ9Plus {

    public static void main (String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String p = reader.readLine();
            boolean isExecutable = false;
            for(int i=0;i<p.length();i++){
                String k = p.substring(i,i+1);
                if(k.equals("H") || k.equals("Q") || k.equals("9") || k.equals("+"))
                {
                    isExecutable = true;
                    break;
                }
            }

            if(isExecutable) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
