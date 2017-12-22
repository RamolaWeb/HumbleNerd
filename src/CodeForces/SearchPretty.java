package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 15/10/17.
 */
public class SearchPretty
{

    public static void main(String [] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            boolean checkWithDifferent = true;
            String parameterStringList[] = reader.readLine().split(" ");
            boolean digitList1[] = new boolean[9];
            boolean digitList2[] = new boolean[9];
            int minAtList1 = Integer.MAX_VALUE;
            int minAtList2 = Integer.MAX_VALUE;

            String digitStringList1[] = reader.readLine().split(" ");
            for(int i =0;i<digitStringList1.length;i++){
                int n = Integer.parseInt(digitStringList1[i]);
                digitList1[n-1] = true;
                if(n < minAtList1) minAtList1 = n;
            }

            String digitStringList2[] = reader.readLine().split(" ");
            for(int i =0;i<digitStringList2.length;i++){
                int n = Integer.parseInt(digitStringList2[i]);
                digitList2[n-1] = true;
                if(n < minAtList2) minAtList2 = n;
            }
            int smallPrettyNum = -1;
            for(int i =0;i<9;i++){
                if(digitList1[i] == true && digitList2[i] == true)
                {
                    smallPrettyNum = i+1;
                    checkWithDifferent = false;
                    break;
                }
            }

            if(checkWithDifferent){
                if(minAtList1 < minAtList2) smallPrettyNum = minAtList1 * 10 + minAtList2;
                else smallPrettyNum = minAtList2 * 10 + minAtList1;
            }

            System.out.println(smallPrettyNum);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
