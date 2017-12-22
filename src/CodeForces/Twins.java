package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sahil on 18/10/17.
 */
public class Twins {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            String coinListString[] = reader.readLine().split(" ");
            ArrayList<Integer> coinList = new ArrayList<>();
            int sum = 0, val =0, count =0;
            for(String k : coinListString){
                int c = Integer.parseInt(k);
                coinList.add(c);
                sum += c;
            }
            Collections.sort(coinList);
            Collections.reverse(coinList);
            for(int a : coinList){
                val += a;
                count++;
                if(val > sum/2) break;
            }

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
