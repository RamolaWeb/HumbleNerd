package CodeForces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by sahil on 24/10/17.
 */
public class Puzzles {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int required = scanner.nextInt();
        int totStudent = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<totStudent;i++)
            list.add(scanner.nextInt());
        Collections.sort(list);
        int minDif = list.get(required-1)-list.get(0) , i=1;
        while (i<=list.size()-required){
            minDif = Math.min(minDif,list.get(i+required-1)-list.get(i));
            i++;
        }
        System.out.println(minDif);
        scanner.close();
    }
}
