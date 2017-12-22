package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by sahil on 25/10/17.
 */
public class BusinessTrip {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt(), t = 0,count =0;
        boolean isReach = false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=12;i++) list.add(scanner.nextInt());
        Collections.sort(list);
        Collections.reverse(list);
        for(int a:list){
            if(t>=target){
                isReach = true;
                break;
            }
            t+=a;
            count+=1;

        }

        if(t == target) isReach = true;

        if(isReach) System.out.println(count);
        else System.out.println(-1);

    }
}
