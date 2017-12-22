package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sahil on 16/10/17.
 */
public class HelpfulMaths {

    public static void main (String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            ArrayList<Integer> numList = new ArrayList<>();
            for(int i =0;i<s.length();i++){
                if(i%2==0) numList.add(Integer.parseInt(s.substring(i,i+1)));
            }
            Collections.sort(numList);
            StringBuilder builder = new StringBuilder();
            int k =0;
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    builder.append(numList.get(k++));
                }
                else builder.append("+");
            }

            System.out.println(builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
