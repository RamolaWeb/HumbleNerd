package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 1/11/17.
 */
public class AandBChess {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int aWeight = 0, bWeight=0;
        for(int i=1;i<=8;i++){
            try {
                String positionList = reader.readLine();
                for(int j=0;j<8;j++){
                    char a = positionList.charAt(j);
                    int s = AandBChess.getWeight(""+a);
                    if(s == -1) continue;
                    if(Character.isUpperCase(a)){
                        aWeight += s;
                    }
                    else{
                    bWeight +=s;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(aWeight > bWeight) System.out.println("White");
        if(aWeight < bWeight) System.out.println("Black");
        if(aWeight == bWeight) System.out.println("Draw");


    }

    public static int  getWeight(String a){
        if(a.equalsIgnoreCase("q")) return 9;
        if(a.equalsIgnoreCase("r")) return 5;
        if(a.equalsIgnoreCase("b")) return 3;
        if(a.equalsIgnoreCase("n")) return 3;
        if(a.equalsIgnoreCase("p")) return 1;
        if(a.equalsIgnoreCase("k")) return 0;
        return -1;
    }
}
