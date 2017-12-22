package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 6/11/17.
 */
public class PalindromePeriodic {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            while (testCase-->0){
                String parameterListString[] = reader.readLine().split(" ");
                int n = Integer.parseInt(parameterListString[0]);
                int p = Integer.parseInt(parameterListString[1]);
                String string[] = new String[p];
                int turn = 1, countA = 0, countB =0;
                for(int i=0;i<p;i++){
                    String c = (turn == 1 ? "a":"b");
                    string[i] = string[p-i-1] = c;
                    turn = 1 - turn;
                }
                StringBuilder builder = new StringBuilder();
                String ans = "";
                for(String a : string){
                    builder.append(a);
                    if(a.equals("a")) countA ++;
                    else countB++;
                }

                ans = builder.toString();

                for(int i=1;i<(n/p);i++){
                    builder.append(ans);
                }

                ans = builder.toString();

                if(countA == p|| countB ==p) System.out.println("impossible");
                else {System.out.println(ans);}

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
