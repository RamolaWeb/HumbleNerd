package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by sahil on 23/12/17.
 */
public class Qaq {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string = reader.readLine();
            int count = 0;
            for(int i=0;i<string.length();i++){
                if(string.substring(i,i+1).equals("Q")){
                    for(int j=i+1;j<string.length();j++){
                        if(string.substring(j,j+1).equals("A")){
                            for(int k=j+1;k<string.length();k++){
                                if(string.substring(k,k+1).equals("Q")){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
