package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 23/12/17.
 */
public class Greed {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            String remainingCola[] = reader.readLine().split(" ");
            int req = 0;
            for(String c : remainingCola){
                req += Integer.parseInt(c);
            }

            String volumeStringList[] = reader.readLine().split(" ");
            int volume[] = new int[num];
            for(int i =0;i<num;i++){
                volume[i] = Integer.parseInt(volumeStringList[i]);
            }

            for(int i=0;i<num;i++){
                for(int j=i+1;j<num;j++){
                    if(volume[i]+volume[j] >= req){
                        System.out.println("YES");
                        return;
                    }
                }
            }

            System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
