package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class WordCapitalization {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
