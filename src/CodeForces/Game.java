package CodeForces;

import java.util.Scanner;

/**
 * Created by sahil on 1/11/17.
 */
public class Game {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        System.out.println(n1>n2?"First":"Second");
        scanner.close();
    }
}
