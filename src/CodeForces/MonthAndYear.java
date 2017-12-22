package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 19/12/17.
 */
public class MonthAndYear {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numOfMonth = Integer.parseInt(reader.readLine());
            String monthDay[] = reader.readLine().split(" ");
            int calenderDay []= {31,28,31,30,31,30,31,31,30,31,30,31};
            int calenderLeapDay []= {31,28,31,30,31,30,31,31,30,31,30,31};
            int i = 0 ;
            boolean isLeap = false;
            for(String k : monthDay){
                int n = Integer.parseInt(k);
                if(n == 28) {
                    i = findIndex(calenderDay,28);
                break;}
                else if(n == 29) {
                    i = findIndex(calenderLeapDay,29);
                    isLeap = true;
                    break;
                }
                else{

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findIndex(int[] arr, int num){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return  -1;
    }
}
