package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 18/10/17.
 */
public class YoungPhysicist {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine()), x = 0, y=0,z=0;
            while (testCase-->0){
                String parameterList[] = reader.readLine().split(" ");
                int fx = Integer.parseInt(parameterList[0]);
                int fy = Integer.parseInt(parameterList[1]);
                int fz = Integer.parseInt(parameterList[2]);
                 x+= fx;
                 y+= fy;
                 z+= fz;
            }

            if(x ==0 && y ==0 && z ==0) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
