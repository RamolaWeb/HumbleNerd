package HackerEarth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by sahil on 21/10/17.
 */
public class CardGame {

    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int firstListLength = s.nextInt();
        int moneyRequired = 0 , maxInSecondList = Integer.MIN_VALUE;
        ArrayList<Integer> firstList = new ArrayList<>();
        for(int i=0;i<firstListLength;i++)
            firstList.add(s.nextInt());
        Collections.sort(firstList);
        int secondListLength = s.nextInt();
        for(int i =0;i<secondListLength;i++){
            int k = s.nextInt();
            maxInSecondList = Math.max(maxInSecondList,k);
        }

        if(maxInSecondList < firstList.get(0)) System.out.println("0");
        else{
            for(int m : firstList){
                if(m > maxInSecondList) break;
                else{
                    moneyRequired += (maxInSecondList - m+1);
                }
            }
            System.out.println(moneyRequired);
        }

    }
}
