package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by sahil on 18/10/17.
 */
public class CapsLock {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            String m = s.substring(1);
            if(m.equals(m.toUpperCase())){
               char q = s.charAt(0);
               if(Character.isUpperCase(q)){
                   System.out.println(s.toLowerCase());
               }
               else{
                   System.out.println(s.substring(0,1).toUpperCase()+m.toLowerCase());
               }
            }
            else System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
