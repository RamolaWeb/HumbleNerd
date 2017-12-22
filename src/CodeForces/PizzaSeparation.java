package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 22/12/17.
 */
public class PizzaSeparation {
    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            String angleStringList[] = reader.readLine().split(" ");
            int angle[] = new int[num];
            for(int i=0;i<num;i++){
                angle[i] = Integer.parseInt(angleStringList[i]);
            }

            int min = Integer.MAX_VALUE;
            for(int i=0;i<num;i++){
                min = Math.min(min, 2 * Math.abs(180-angle[i]));
            }
            System.out.println(min);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
