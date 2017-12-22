package CodeForces;

import java.util.Scanner;

/**
 * Created by sahil on 1/11/17.
 */
public class BearBigBrother {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        while(a<=b){
            a *= 3;
            b *=2;
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}
