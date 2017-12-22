package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class ChatRoom {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            boolean isSayHello = true;
            boolean check[] = new boolean[5];
            for(int i =0;i<5;i++)
                check[i] = false;
            for(int i =0;i<s.length();i++){
                String k = s.substring(i,i+1);
                System.out.println(k);
                if(k.equalsIgnoreCase("h")) if(check[0] == false) {check[0] = true; System.out.println("h comes");}
                else if(k.equalsIgnoreCase("e")) if(check[0] == true && check[1] == false) {check[1] = true; System.out.println("e comes");}
                else if(k.equalsIgnoreCase("l")) if(check[0] == true && check[1] == true && check[2] == false) {check[2] = true; System.out.println("l comes");}
                else if(k.equalsIgnoreCase("l")) if(check[0] == true && check[1] == true && check[2] == true && check[3] == false) {check[3] = true; System.out.println("l comes");}
                else if(k.equalsIgnoreCase("o")) if(check[0] == true && check[1] == true && check[2] == true && check[3] == true && check[4] == false) {check[4] = true;
                    System.out.println("o comes");
                break;
                };
            }
            for(int i =0;i<5;i++)
                if(check[i] == false) {
                    isSayHello = false;
                    break;
                }
            if(isSayHello) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
