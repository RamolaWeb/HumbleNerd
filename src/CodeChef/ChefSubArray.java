package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 10/11/17.
 */
public class ChefSubArray {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int n = Integer.parseInt(parameterStringList[0]);
            int q = Integer.parseInt(parameterStringList[1]);
            int l = Integer.parseInt(parameterStringList[2]);
            int r = Integer.parseInt(parameterStringList[3]);
            int num[] = new int[n];
            int h = (int) Math.ceil(Math.log(n)/Math.log(2));
            int size = 2 * (int) Math.pow(2,h) -1;
            int tree[] = new int[size];
            int maxTree[] = new int[size];
            ChefSubArray.buildMax(maxTree,num,1,1,n);
            ChefSubArray.build(tree,maxTree,1,1,n,l,r);
            for(int i =1 ;i<=q;i++){
                String queryParameterList[] = reader.readLine().split(" ");
                int x = Integer.parseInt(queryParameterList[1]);
                int y = Integer.parseInt(queryParameterList[2]);
                if(queryParameterList[0].equals("1")){
                     num[x-1] = y;
                     ChefSubArray.updateMax(maxTree,1,1,n,x,y);
                     ChefSubArray.update(tree,maxTree,1,1,n,l,r,x);
                }
                else{
                   System.out.println(ChefSubArray.query(tree,1,1,n,x,y));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buildMax(int tree[],int num[],int node,int start,int end){
        if(start == end){
            tree[node] = num[start-1];
            return;
        }
        else {
            int mid = (start+end)/2;
            buildMax(tree,num,2*node,start,mid);
            buildMax(tree, num, 2*node+1, mid+1, end);
            tree[node] = Math.max(tree[2*node],tree[2*node+1]);
        }
    }

    public static void updateMax(int tree[],int node,int start,int end,int index,int value){
        if(start == end){
            tree[node] = value;
            return;
        }
        else {
            int mid = (start+end)/2;
            if(start <= index && index <= mid) updateMax(tree, 2*node, start, mid, index, value);
            else updateMax(tree,2*node+1,mid+1,end,index,value);
            tree[node] = Math.max(tree[2*node],tree[2*node+1]);
        }
    }

    public static void build(int tree[],int max[],int node,int start,int end,int l, int r){
        if(start == end){
            if(max[node] >= l && max[node] <= r)
                tree[node] = 1;
            else  tree[node] = 0;
        }
        else{
            int mid = (start+end)/2;
            build(tree, max, 2*node, start, mid, l, r);
            build(tree, max, 2*node+1, mid+1, end, l, r);

            if(max[node] >= l && max[node] <= r)
                tree[node] = tree[2*node]+tree[2*node+1] +1;
            else  tree[node] = tree[2*node]+tree[2*node+1] ;
        }
    }

    public static int query(int tree[],int node,int start,int end,int l,int r){
        if(r < start || l > end) return 0;
        if(l <= start && r >= end){
            return tree[node];}
        int mid = (start+end)/2;
        int q1 = query(tree, 2*node, start, mid, l, r);
        int q2 = query(tree, 2*node+1, mid+1, end, l, r);
        return  q1+q2;
    }

    public static void update(int tree[],int max[],int node,int start,int end,int l, int r, int index){
        if(start == end){
            if(max[node] >= l && max[node] <= r)
                tree[node] = 1;
            else  tree[node] = 0;
        }
        else {
            int  mid =(start+end)/2;
            if(start <= index &&  index <= mid) update(tree, max, 2*node, start, mid, l, r, index);
           else update(tree, max, 2*node+1, mid+1, end, l, r, index);
            if(max[node] >= l && max[node] <= r)
                tree[node] = tree[2*node]+tree[2*node+1] +1;
            else  tree[node] = tree[2*node]+tree[2*node+1] ;
        }
    }
}
