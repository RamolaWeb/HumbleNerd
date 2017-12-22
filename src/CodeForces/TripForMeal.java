package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 16/10/17.
 */
public class TripForMeal {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int target = Integer.parseInt(reader.readLine());
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());

            int n = 1, dis =0, where = 0;
            while(n<target){
                if(where == 0){
                    if(dis+a>dis+b) {dis +=b;
                    where = 1;
                    }
                    else{
                        dis +=a;
                        where = 2;
                    }
                }
                else if(where == 1){
                    if(dis+c>dis+b) {dis +=b;
                        where = 0;
                    }
                    else{
                        dis +=c;
                        where = 2;
                    }
                }
                else if (where == 2){
                    if(dis+a>dis+c) {dis +=c;
                        where = 1;
                    }
                    else{
                        dis +=a;
                        where = 0;
                    }

                }
                n++;
            }
            System.out.println(dis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
