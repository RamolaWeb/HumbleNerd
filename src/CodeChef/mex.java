package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sahil on 7/10/17.
 */
public class mex {

    public static void main(String [] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testcase  = Integer.parseInt(bufferedReader.readLine());
        while(testcase-->0){
            int max = -1, count = 0, k=0,n=0, h =0;
            String paramStringList[] = bufferedReader.readLine().split(" ");
            int paramList[] = new int[paramStringList.length];
            for(int i=0;i<paramList.length;i++)
                paramList[i] = Integer.parseInt(paramStringList[i]);
            String numStringList[] = bufferedReader.readLine().split(" ");
            int numList[] = new int[numStringList.length];
            for(int i=0;i<numList.length;i++){
                numList[i] = Integer.parseInt(numStringList[i]);
            }
                n = paramList[0];
                k = paramList[1];
                HashMap<Integer,Boolean> map = new HashMap<>();
            for(int i=0;i<=n+k;i++)
                map.put(i,false);
            for(int i=0;i<n;i++)
                map.put(numList[i],true);

            for(Map.Entry m : map.entrySet()){
                h++;
                if((Boolean) m.getValue() == false){
                     count ++;
                    if(count > k){
                        System.out.println(m.getKey());
                        break;
                    }
                }

            }

        }

    }


}
