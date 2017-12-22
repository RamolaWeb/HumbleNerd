package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by sahil on 22/12/17.
 */
public class BeautifulDivisor {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(reader.readLine());
            ArrayList<Integer> binaryList = new ArrayList<>();
            while (num!=1){
                int c = num;
                c/=2;
                binaryList.add(num%2);
                num = c;
            }
            binaryList.add(1);
            /*
            for(int g : binaryList){
                System.out.print(g);
            }
            */
            int k = -1 , i=0;
            int max = 1;
            while (i<binaryList.size()){
                if(binaryList.get(i) == 0){
                    boolean isOk = true;
                    k++;
                    int d = -1;
                    for (int m = k+i+1;m<binaryList.size();m++){
                        if(binaryList.get(m) == 0){
                            k++;
                        }
                        else {
                            d = m;
                            break;
                        }
                    }
                    for(int s = d;s<=d+k+1 && s<binaryList.size();s++){
                        if(binaryList.get(s) == 0){
                            isOk = false;
                            break;
                        }
                    }
                    if(isOk){
                        int n = 0;
                    System.out.println(d+" "+k+" "+i);
                        for(int u = i;u<=d+k+i && u<binaryList.size()-1;u++){
                            n += binaryList.get(binaryList.size()-u) * Math.pow(2,binaryList.size()-u);
                        }
                        System.out.println(n);
                        max = Math.max(max,n);
                    }
                }
                i++;
                k = -1;
            }

            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
