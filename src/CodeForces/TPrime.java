package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by sahil on 1/11/17.
 */
public class TPrime {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine());
            String numStringList[] = reader.readLine().split(" ");
            HashMap<Double,Boolean> map = new HashMap<>();
            map.put(1.0,false);
            for(double i =2.0;i<=1000000.0;i+=1.0){
                map.put(i,true);
            }
            for(double i =2.0;i*i<=1000000.0;i+=1.0){
                if(map.get(i))
                for(double j = 2*i;j<=1000000.0;j+=i)
                    map.put(j,false);
            }

            for(String s :numStringList){
                double k = Double.parseDouble(s);
                if(map.containsKey(Math.sqrt(k)))
                if(map.get(Math.sqrt(k))) System.out.println("YES");
                else  System.out.println("NO");
                else System.out.println("NO");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
