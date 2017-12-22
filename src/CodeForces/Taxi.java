package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sahil on 16/10/17.
 */
public class Taxi {

    public static void main (String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int noOfGroup = Integer.parseInt(reader.readLine());
            int gTable[] = new int[4];
            String listOfStudent[] = reader.readLine().split(" ");
            ArrayList<Integer> fList = new ArrayList<>();
            for(int i=0;i<noOfGroup;i++)
            {
                int f = Integer.parseInt(listOfStudent[i]);
                fList.add(f);
                gTable[f-1] += 1;
            }
            Collections.sort(fList);
            Collections.reverse(fList);
            int noOfTaxi = 0, i =0, j=fList.size()-1;
            while(i<=j){
                int f = fList.get(i++);
                int capacity = 4 -f;
                if(capacity == 0) {
                    noOfTaxi ++;
                    continue;}
                else {
                    while (j>=0 && capacity-fList.get(j) >=0){
                        capacity -= fList.get(j--);
                    }
                    noOfTaxi++;
                }
            }

            System.out.println(noOfTaxi);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
