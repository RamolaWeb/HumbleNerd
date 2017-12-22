package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 7/10/17.
 */
public class PerfCont {

    public static void main (String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String testCaseString = reader.readLine();
            int testCase = Integer.parseInt(testCaseString);
            while(testCase-- > 0){
                int cakeWalkNum = 0, hardNum = 0;
                boolean isBalanced = false;
                String parameterString = reader.readLine();
                String parameterStringList[] = parameterString.split(" ");
                int param[] = new int[parameterStringList.length];
                for(int i =0;i<parameterStringList.length;i++){
                    param[i] = Integer.parseInt(parameterStringList[i]);
                }

                String solverStringList [] = reader.readLine().split(" ");
                int solverList[] = new int[solverStringList.length];
                for(int i=0;i<solverList.length;i++){
                    solverList[i] = Integer.parseInt(solverStringList[i]);
                }
                for(int i =0;i<solverList.length;i++){
                    int n = solverList[i];
                   if(n <= param[1]/10) hardNum++;
                   if(n >= param[1]/2) cakeWalkNum++;
                   if(hardNum == 2 && cakeWalkNum == 1){
                       isBalanced = true;

                   }
                   else isBalanced = false;
                }
                if(isBalanced) System.out.println("yes");
                else System.out.println("no");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
