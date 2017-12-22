package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by sahil on 25/10/17.
 */
public class DuffMeat {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int days = Integer.parseInt(reader.readLine());
            int minRate = Integer.MAX_VALUE, totQuat = 0, minMoney = 0;
            ArrayList<Integer> rateList = new ArrayList<>();
            ArrayList<Integer> demandList = new ArrayList<>();
            for(int i=0;i<days;i++){
                String parameterList[] = reader.readLine().split(" ");
                int rate = Integer.parseInt(parameterList[1]);
                int demand = Integer.parseInt(parameterList[0]);
                totQuat += demand;
                minRate = Math.min(minRate,rate);
                rateList.add(rate);
                demandList.add(demand);
            }
            int remainingQuat = totQuat;
            for(int i=0;i<days;i++){
                int r = rateList.get(i);
                int d = demandList.get(i);
                if(r == minRate)
                {
                    minMoney += minRate * remainingQuat;
                    break;
                }
                minMoney += d * r;
                remainingQuat -= d;
            }

            System.out.println(minMoney);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
