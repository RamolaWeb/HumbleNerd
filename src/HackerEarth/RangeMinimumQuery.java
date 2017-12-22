package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 8/11/17.
 */
public class RangeMinimumQuery {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int n = Integer.parseInt(parameterStringList[0]);
            int q = Integer.parseInt(parameterStringList[1]);
            String arr[] = reader.readLine().split(" ");
            int num[] = new int[n];
            int h = (int) Math.ceil(Math.log(n)/Math.log(2));
            int size = 2 * (int) Math.pow(2,h) -1;
            int tree[] = new int[size];
            for(int i=0;i<n;i++){
                num[i] = Integer.parseInt(arr[i]);
            }
            RangeMinimumQuery.build(tree,num,1,1,n);
            for(int i =1;i<=q;i++){
                String queryParameterList[] = reader.readLine().split(" ");
                int x  = Integer.parseInt(queryParameterList[1]);
                int y = Integer.parseInt(queryParameterList[2]);
                if(queryParameterList[0].equals("q")){
                     System.out.println(RangeMinimumQuery.query(tree,1,1,n,x,y));
                }
                else {
                   RangeMinimumQuery.update(tree,num,1,1,n,x,y);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void build(int tree[],int num[],int node,int start,int end){
        if(start == end){
            tree[node] = num[start-1];
            return;
        }
        else{
            int mid = (start+end)/2;
            build(tree,num,2*node,start,mid);
            build(tree,num,2*node+1,mid+1,end);
            tree[node] = Math.min(tree[2*node],tree[2*node+1]);
        }
    }

    public static void update(int tree[], int num[],int node,int start,int end,int index, int value){
           if(start == end){
               tree[node] = value;
               num[index-1] = value;
               return;
           }
           else{
               int mid = (start+end)/2;
                   if(start <=index && index<=mid)
                   update(tree,num,2*node,start,mid,index,value);
                   else
                   update(tree,num,2*node+1,mid+1,end,index,value);
                   tree[node] = Math.min(tree[2*node],tree[2*node+1]);
           }
    }

    public static int query(int tree[], int node, int start,int end,int l, int r){
        if(r<start || l>end) return Integer.MAX_VALUE;

        if(l <= start && r >= end){
            return tree[node];
        }
        int mid = (start+end)/2;
        int q1 = query(tree,2*node,start,mid,l,r);
        int q2 = query(tree,2*node+1,mid+1,end,l,r);
        return (Math.min(q1,q2));
    }
}
