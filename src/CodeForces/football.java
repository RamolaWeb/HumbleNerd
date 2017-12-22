package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 15/10/17.
 */
public class football {

    public static void main (String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String representation = reader.readLine();
            String initial = representation.substring(0,1);
            int count = 1;
            boolean isDangerous = false;
            for(int i =1;i<representation.length();i++){
                String k = representation.substring(i,i+1);
                if(initial.equals(k)){
                    count++;
                    if(count >= 7) {
                        isDangerous = true;
                        break;
                    }
                }
                else{
                    initial = k;
                    count = 1;
                }

            }

            if(isDangerous) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
