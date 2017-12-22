package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class BeautifulMatrix {

    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int targetX = -1 , targetY = -1;
        try {
            for (int i = 1; i <= 5; i++) {
                String inputList[] = reader.readLine().split(" ");
                for(int j=0;j<5;j++){
                    String k = inputList[j];
                    if(k.equals("1")){
                        targetX = i;
                        targetY = j+1;
                    }
                }

            }

            System.out.println(Math.abs(targetX-3)+ Math.abs(targetY-3));
        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

}
