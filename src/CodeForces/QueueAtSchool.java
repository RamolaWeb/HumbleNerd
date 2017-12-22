package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 25/10/17.
 */
public class QueueAtSchool {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int t = Integer.parseInt(parameterStringList[1]);
            int s = Integer.parseInt(parameterStringList[0]);
            String word[] = new String[s];
            String q = reader.readLine();
            for(int i=0;i<s;i++)
                word[i] = q.substring(i,i+1);
            while (t-->0){
                int i =0;
                while (i<word.length-1){
                    if(word[i].equals("B") && word[i+1].equals("G")){
                        word[i] = "G";
                        word[i+1] = "B";
                        i+=2;
                    }
                    else i+=1;
                }
            }
            String res = "";
            for(String k : word){
                res += k;
            }

            System.out.println(res);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
