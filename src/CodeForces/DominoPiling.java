package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 15/10/17.
 */
public class DominoPiling {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int m = Integer.parseInt(parameterStringList[0]);
            int n = Integer.parseInt(parameterStringList[1]);

            int domino = (((m/2)* n)+((n/2)*(m%2)));

            System.out.println(domino);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
