package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 23/10/17.
 */
public class Tram {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int noOfStation = Integer.parseInt(reader.readLine());
            int minCapacity = 0, newMinCapacity = 0;
            for(int i=0;i<noOfStation;i++){
                String stationParameter[] = reader.readLine().split(" ");
                int out = Integer.parseInt(stationParameter[0]);
                int in = Integer.parseInt(stationParameter[1]);
                 newMinCapacity += in-out;
                minCapacity = Math.max(minCapacity,newMinCapacity);
            }
            System.out.println(minCapacity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
