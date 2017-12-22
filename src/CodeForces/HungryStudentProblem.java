package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 16/12/17.
 */
public class HungryStudentProblem {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            while(testCase-->0){
                boolean isTrue = false;
                int n = Integer.parseInt(reader.readLine());
                for(int x =0;x*7<=n;x++){
                    if((n-x*7) % 3 == 0){
                        isTrue = true;
                        break;
                    }
                }
                if(isTrue) System.out.println("YES");
                else System.out.println("NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
