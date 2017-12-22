package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class GeorgeAccommodation {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            int count =0;
            while (testCase-->0){
                String parameterStringList[] = reader.readLine().split(" ");
                int p = Integer.parseInt(parameterStringList[0]);
                int q = Integer.parseInt(parameterStringList[1]);
                if(q-p>=2) count++;
            }

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
