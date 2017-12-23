package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


/**
 * Created by sahil on 23/12/17.
 */
public class VladCafe {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            String logStringList[] = reader.readLine().split(" ");
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i =0;i<num;i++){
                int log = Integer.parseInt(logStringList[i]);
                if(map.containsKey(log)){
                    map.put(log,0);
                }
                else{
                    map.put(log,1);
                }
                for(int k : map.keySet()){
                    if(k != log ){
                        map.put(k,map.get(k)+1);
                    }
                }
            }

            int cafe = Integer.MIN_VALUE;
            int index = -1;
            for(int k : map.keySet()){
                if(map.get(k) > cafe){
                    cafe = map.get(k);
                    index = k;
                }
            }

            System.out.println(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
