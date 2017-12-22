package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 10/10/17.
 */
public class theaterSquare {

    public static void main (String [] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String [] parameterStringList = reader.readLine().split(" ");
            int parameter [] = new int[parameterStringList.length];
            for(int i=0;i<parameter.length;i++)
                parameter[i] = Integer.parseInt(parameterStringList[i]);
            double w = parameter[0];
            double h = parameter[1];
            double a = parameter[2];
            System.out.println(Math.ceil(w/a));
            System.out.println(Math.ceil(h/a));
            long  count = 0;
            count = (long) (Math.ceil(w/a) * Math.ceil(h/a));
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
