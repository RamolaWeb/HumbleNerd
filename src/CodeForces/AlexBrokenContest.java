package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sahil on 24/10/17.
 */
public class AlexBrokenContest {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String n = reader.readLine();
            String nameList [] = n.split("_");
            int count =0;
            for(String name : nameList)
            {
            count += checkOccurrence(name);
            }
            if(count == 1) System.out.println("YES");
            else System.out.println("NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int checkOccurrence(String name){
        int count =0;
        Pattern p = Pattern.compile("Danil|Olya|Slava|Ann|Nikita");
        Matcher matcher = p.matcher(name);
        while (matcher.find()) count +=1;
        return count;
    }
}
