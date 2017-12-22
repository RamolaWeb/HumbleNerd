package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 19/12/17.
 */
public class Rounding {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            int n = num % 10;
            if (n<=5){
                num -=n;
                System.out.println(num);
            }
            else if (n > 5){
                num += 10-n;
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
