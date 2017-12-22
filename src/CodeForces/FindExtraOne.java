package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 19/12/17.
 */
public class FindExtraOne {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            int countNegative = 0, countPositive=0;
            for(int i =1 ;i<=num;i++){
                String coordinateStringList[] = reader.readLine().split(" ");
                if(Integer.parseInt(coordinateStringList[0]) < 0) countNegative++;
                else countPositive++;
            }
            if(countNegative >= countPositive){
                if(countPositive>1) System.out.println("No");
                else {
                    System.out.println("Yes");
                }
            }

            else {
                if(countNegative>1) System.out.println("No");
                else {
                    System.out.println("Yes");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
