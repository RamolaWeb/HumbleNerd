package CodeChef.JAN18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sahil on 8/1/18.
 */
public class Rectangle {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            while (testCase-- >0){
                String[] sideString = reader.readLine().split(" ");
                ArrayList<Integer> side = new ArrayList<>();
                for(String s: sideString){
                    side.add(Integer.parseInt(s));
                }
                Collections.sort(side);
                int a = side.get(0);
                int b = side.get(1);
                int c = side.get(2);
                int d = side.get(3);

                if((a == b) && (c == d)){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
