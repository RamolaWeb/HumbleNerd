package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 15/10/17.
 */
public class BitPlusPlus {

    public static void main (String [] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        try {
            int noOfQueries = Integer.parseInt(reader.readLine());
            while(noOfQueries-- >0){
                String operation = reader.readLine();
                if(operation.contains("++")) x++;
                else x--;
            }
            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
