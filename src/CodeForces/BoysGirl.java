package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class BoysGirl {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            int count = 0;
            boolean characterMap[] = new boolean[26];
            for(int i=0;i<26;i++)
                characterMap[i] = false;
            for(int i=0;i<name.length();i++){
                int a = name.charAt(i);
                if(characterMap[a-97] == false){
                    characterMap[a-97] = true;
                    count++;
                }
            }
            if(count % 2 == 0) System.out.println("CHAT WITH HER!");
            else System.out.println("IGNORE HIM!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
