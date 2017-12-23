package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 23/12/17.
 */
public class Wrath {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            boolean alive[] = new boolean[num];
            for(int i=0;i<num;i++){
                alive[i] = true;
            }
            int count = 0;
            String wrathString[] = reader.readLine().split(" ");
            int wrath[] = new int[num];
            for(int i=0;i<num;i++){
                wrath[i] = Integer.parseInt(wrathString[i]);
            }

            for(int j=num-1;j>=0;j--){
                    for(int i=j-1;i>=0;i--){
                            if(i<j && i>= j-wrath[j]){
                                alive[i] = false;
                            }
                        }
                    }

                    for(int i =0;i<num;i++){
                if(alive[i] == true){
                    count++;
                }
                    }

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
