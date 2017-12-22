package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 30/10/17.
 */
public class BookReading {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int noOfDays = Integer.parseInt(parameterStringList[0]);
            int secondRequired = Integer.parseInt(parameterStringList[1]);
            String secondStringList[] = reader.readLine().split(" ");
            int count  = 0, total =0;
            for(int i=0;i<noOfDays && total<secondRequired;i++){
                total +=  86400-Integer.parseInt(secondStringList[i]) ;
                count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
