package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 8/10/17.
 */
public class MagicArray
{
    public static final int MAX = 1000000;
    private int k =0;

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testcase = Integer.parseInt(reader.readLine());
            while(testcase-->0) {
                MagicArray magicArray = new MagicArray();
                int ingredient[] = new int[MAX];
                int noOfDishes = Integer.parseInt(reader.readLine());
                int dish[] = new int[noOfDishes];
                int q = 0;
                for(int i=0;i<noOfDishes;i++){
                    String ingredientStringList [] = reader.readLine().split(" ");
                    dish[i] = Integer.parseInt(ingredientStringList[0]);
                    for(int j =1;j<=dish[i];j++)
                        ingredient[q+j-1] = Integer.parseInt(ingredientStringList[j]);
                        q += dish[i];
                }
                int n = noOfDishes, k = 0, quality = 0;
                int val[] = new int[2 * (n - 2) + 2];
                for (int i = 0; i <= n - 1; i++) {
                    magicArray.value(ingredient, val, k, k + dish[i] - 1, i, n);
                    k += dish[i];
                }
                int z = 1;
                for (int i = 1; i <= val.length - 1; i += 2) {
                    quality += Math.abs(val[i] - val[i - 1]) * (z++);
                }

                System.out.println(quality);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public void value(int ingredient[], int val[], int start,int end,int index,int n){
        merge_sort(ingredient,start,end);
        if(index == 0) val[k++] = ingredient[end];
        else if(index == n-1) val[k] = ingredient[start];
        else{
            val[k++]= ingredient[start];
            val[k++] =  ingredient[end];
        }

    }

    private void merge_sort(int ingredient[],int start,int end){
        int mid;
        int temp[] = new int[MAX];
        if(start<end){
            mid = (start+end)/2;
            merge_sort(ingredient,start,mid);
            merge_sort(ingredient,mid+1,end);
            merge(ingredient,temp,start,mid,mid+1,end);
            copy(ingredient,temp,start,end);
        }

    }


    private void merge(int arr[],int temp[],int low1,int up1,int low2,int up2){
        int i= low1;
        int j=low2;
        int k=low1;
        while((i<=up1)&&(j<=up2)){
            if(arr[i]>=arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }
        while (i<=up1) temp[k++] = arr[i++];

        while ((j<=up2)){
            temp[k++] = arr[j++];
        }

    }

    private void copy(int arr[],int temp[],int low,int up){
        int i;
        for(i=low;i<=up;i++)
            arr[i] = temp[i];
    }

}
