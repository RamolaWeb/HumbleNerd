package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 5/10/17.
 */
public class Bus {

    public static void main(String[] args){
        Bus bus = new Bus();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameter = bufferedReader.readLine();
            String [] parameterList = parameter.split(" ");
            int param[] = new int[parameterList.length];
            for(int i=0;i<parameterList.length;i++){
                param[i] = Integer.parseInt(parameterList[i]);
            }

            int a = param[0];
            int b = param[1];
            int f = param[2];
            int k = param[3];
            System.out.println(""+bus.calculateMinRefilling(a,b,f,k));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  int calculateMinRefilling(int a, int b, int f, int k){
        int noOfJourney = 0;
        int direction = 1;
        int noOfFuelRefilling = 0;
        int fuel = b;
        while(noOfJourney < k){
            if(direction == 1){
                int i = 0;
                while(i<a){
                    if(fuel!=0 || i == f){
                        if(i == f){
                            int m= 2;
                            if(k-noOfJourney ==1) m=1;
                            if(fuel < (m*(a-f))){
                                fuel = b;
                                noOfFuelRefilling++;
                            }
                        }
                    }
                    else{return -1;}
                    i++;
                    fuel--;
                }
                noOfJourney ++;
                direction -=1;

            }
            else{
                int i = a;
                while(i>0){
                    if(fuel!=0 || i==f){
                        if(i == f){
                            int m= 2;
                            if(k-noOfJourney ==1) m=1;
                            if(fuel < (m *f)){
                                fuel = b;
                                noOfFuelRefilling++;
                            }
                        }
                    }
                    else {return -1;}
                    i--;
                    fuel--;
                }
                noOfJourney ++;
                direction +=1;
            }
        }
        return noOfFuelRefilling;
    }
}
