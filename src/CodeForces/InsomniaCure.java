package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sahil on 24/10/17.
 */
public class InsomniaCure {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int count =0;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i =1;i<=d;i++){
            map.put(i,false);
        }
        for(int i =k;i<=d;i+=k){
            map.put(i,true);
        }
        for(int i =l;i<=d;i+=l){
            map.put(i,true);
        }
        for(int i =m;i<=d;i+=m){
            map.put(i,true);
        }
        for(int i =n;i<=d;i+=n){
            map.put(i,true);
        }
        for(int q : map.keySet()){
            if(map.get(q)) count++;
        }

        System.out.println(count);
    }
}
