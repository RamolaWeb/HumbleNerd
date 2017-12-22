package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 12/10/17.
 */
public class StringTask {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String word = reader.readLine().toLowerCase();
            StringBuilder builder = new StringBuilder();
            for(int i =0;i<word.length();i++){
                String m = word.substring(i,i+1);
                if(m.equals("a") || m.equals("o") || m.equals("y")|| m.equals("e") || m.equals("u") || m.equals("i"))
                    continue;
                else {
                    builder.append("."+m);
                }
            }
            System.out.println(builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
