package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by sahil on 26/10/17.
 */
public class BoryaDiagnosis {

    public static void main(String[] arg) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int noOfDoctor = Integer.parseInt(reader.readLine());
        ArrayList<Integer> initialList = new ArrayList<>();
        ArrayList<Integer> freqList = new ArrayList<>();
        for(int i=0;i<noOfDoctor;i++){
            String parameterList[] = reader.readLine().split(" ");
            initialList.add(Integer.parseInt(parameterList[0]));
            freqList.add(Integer.parseInt(parameterList[1]));
        }
        int target = initialList.get(0);
        for(int j=1;j<noOfDoctor;j++){
            int newtarget = initialList.get(j);
            while (target+1>newtarget){
                newtarget += freqList.get(j);
            }
            target = newtarget;
        }

        System.out.println(target);
    }
}
