package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 5/11/17.
 */
public class ChefLeftRight {

    public static void main(String[] arg){
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            while (testCase-->0){
                String parameterStringList[] = reader.readLine().split(" ");
                int rezibaRating = Integer.parseInt(parameterStringList[1]);
                int leftBound = Integer.MIN_VALUE;
                int rightBound = Integer.MAX_VALUE;
                boolean isCorrect = true;
                String peopleRating[] = reader.readLine().split(" ");
                for(String r : peopleRating){
                    int rate = Integer.parseInt(r);
                    if(rate == rezibaRating) break;
                    if(rate > rezibaRating){
                        if(rate > rightBound) {
                            isCorrect = false;
                            break;
                        }
                        else {
                            rightBound = rate;
                        }
                    }
                    else{
                        if(rate < leftBound) {
                            isCorrect = false;
                            break;
                        }
                        else {
                            leftBound = rate;
                        }
                    }
                }
                if(isCorrect) System.out.println("YES");
                else System.out.println("NO");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
