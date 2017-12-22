package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 31/10/17.
 */
public class JapaneseCrossword {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int n = Integer.parseInt(parameterStringList[0]);
            int x = Integer.parseInt(parameterStringList[1]);
            String encodingString[] = reader.readLine().split(" ");
            int totSpaceOccupied = 0, i=0;
            boolean isUnique = true;
            while (i<n){
                int a = Integer.parseInt(encodingString[i]);
                if(i!=n-1) totSpaceOccupied += a+1;
                else{
                    if(x-totSpaceOccupied > a) {isUnique = false;}
                    else {
                        totSpaceOccupied += a;
                    }
                }
                i++;
            }

            if(totSpaceOccupied > x) isUnique = false;

            if(isUnique) System.out.println("YES");
            else  System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
