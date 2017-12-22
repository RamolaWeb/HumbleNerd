package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 13/11/17.
 */
public class LuckyPurchase {

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int laptopCount = Integer.parseInt(reader.readLine());
            int minLaptopPrice = Integer.MAX_VALUE;
            String minLaptopName = "";
            for(int i=1 ;i<=laptopCount;i++){

                String laptop[] = reader.readLine().split(" ");
                String name = laptop[0];
                String price = laptop[1];
                int fourCount = 0 , sevenCount = 0;

                for(int j=0;j<price.length();j++){
                    String k = price.substring(j,j+1);
                    if(k.equals("7")) sevenCount ++;
                    else if(k.equals("4")) fourCount++;
                }

                if(sevenCount == 0 || fourCount == 0) continue;
                if(sevenCount != fourCount) continue;

                int p = Integer.parseInt(price);
                if(p < minLaptopPrice) {
                    minLaptopPrice = p;
                    minLaptopName = name;
                }

            }

            if(minLaptopPrice == Integer.MAX_VALUE) System.out.println("-1");
            else System.out.println(minLaptopName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
