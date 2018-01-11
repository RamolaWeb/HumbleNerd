package CodeChef.JAN18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sahil on 11/1/18.
 */
public class ScoreMax {

    private int num;
    private int index;

    public ScoreMax(int num, int index) {
        this.num = num;
        this.index = index;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            while (testCase -- >0){
                int n = Integer.parseInt(reader.readLine());
                ArrayList<ScoreMax> list = new ArrayList<>();
                for(int i =0;i<n;i++){
                    String numString[] = reader.readLine().split(" ");
                    for(String s : numString){
                        list.add(new ScoreMax(Integer.parseInt(s), i));
                    }
                }
                Collections.sort(list, new Comparator<ScoreMax>() {
                    @Override
                    public int compare(ScoreMax o1, ScoreMax o2) {
                        return o1.getNum()- o2.getNum();
                    }
                });

                Collections.reverse(list);
                int largeFind = Integer.MAX_VALUE;
                long sum = 0;
                int indexCheck = 0;
                for(int i =0 , j = n-1; i<list.size() && j >= 0; i++){
                    int l = list.get(i).getNum();
                    int m = list.get(i).getIndex();
                    if(m == j && l < largeFind) {
                        largeFind = l;
                        sum += l;
                        j--;
                        indexCheck++;
                    }
                }

                if(sum == 0 || indexCheck != n) System.out.println("-1");
                else System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
