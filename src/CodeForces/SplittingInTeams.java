package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 19/12/17.
 */
public class SplittingInTeams {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            String numStringList [] = reader.readLine().split(" ");
            int one =  0, two = 0;
            for(String s : numStringList){
                if(s.equals("2")) two++;
                else one++;
            }
            if(one == 0){
                System.out.println(0);
            }

           else if(one >= two){
                System.out.println(two+(one-two)/3);
            }
            else{
                System.out.println(one);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
