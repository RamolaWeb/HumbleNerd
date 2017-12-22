package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 4/11/17.
 */
public class VILTRIBE {

    public static void main(String[] arg){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(bufferedReader.readLine());
            while(testCase-->0){
                int controlA = 0, controlB = 0, noOfEmpty =0;
                String village = bufferedReader.readLine(), previousControlTribe = "";
                for(int i=0;i<village.length();i++){
                    String c = village.substring(i,i+1);
                    if(c.equalsIgnoreCase("A")) {
                        controlA++;
                        if(previousControlTribe.equalsIgnoreCase("A")) {

                            controlA += noOfEmpty;

                        }
                        noOfEmpty = 0;
                        previousControlTribe = "A";
                    }
                    else if(c.equalsIgnoreCase("B")) {

                        controlB++;
                        if(previousControlTribe.equalsIgnoreCase("B")) {

                            controlB += noOfEmpty;

                        }
                        noOfEmpty = 0;
                        previousControlTribe = "B";
                    }
                    else if(c.equalsIgnoreCase(".")){noOfEmpty++;}
                }

                System.out.println(controlA+" "+controlB);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
