package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 22/10/17.
 */
public class NearlyLuckyNumber {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String num = reader.readLine();
            int count =0;
            boolean isLucky = true;
            for(int i =0;i<num.length();i++){
                String k = num.substring(i,i+1);
                if(k.equals("4") || k.equals("7")) count += 1;
            }

            if(count == 0) isLucky = false;
            while (count > 0){
                int a = count % 10;
                if(a == 4 || a== 7){
                    count /=10;
                    continue;
                }
                else{
                    isLucky = false;
                    break;
                }
            }

            if(isLucky) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
