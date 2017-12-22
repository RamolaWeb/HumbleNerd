package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 19/12/17.
 */
public class PositionInFunction {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int a = Integer.parseInt(parameterStringList[0]);
            int b = Integer.parseInt(parameterStringList[1]);
            int c = Integer.parseInt(parameterStringList[2]);
            int pos = -1;
            for(int i=0;i<b;i++){
                if(a<b){
                    a *= 10;
                    int n = a/b;
                    int d = a % b;
                    a = d;
                    if(n == c){
                        pos = i+1;
                        break;
                    }
                }
            }
            System.out.println(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
