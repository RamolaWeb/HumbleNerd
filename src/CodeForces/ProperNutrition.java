package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 19/12/17.
 */
public class ProperNutrition {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(reader.readLine());
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

            for(int x =0;x*a<=n;x++){
                if((n-x*a) % b == 0){
                    System.out.println("YES");
                    System.out.println(x+" "+(n-x*a) / b);
                    return;
                }
            }
            System.out.println("NO");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
