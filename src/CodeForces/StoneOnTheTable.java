package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by sahil on 23/10/17.
 */
public class StoneOnTheTable {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int noOfStone = Integer.parseInt(reader.readLine());
            Stack<String> stack = new Stack<>();
            int noOfRemoveStone = 0;
            String colorStoneString = reader.readLine();
            for(int i=0;i<noOfStone;i++)
                stack.push(colorStoneString.substring(i,i+1));
            String top = stack.pop();
            while (!stack.empty()){
                String newTop = stack.pop();
                if(top.equals(newTop)) noOfRemoveStone++;
                else top = newTop;
            }
            System.out.println(noOfRemoveStone);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
