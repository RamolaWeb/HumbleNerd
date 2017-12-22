package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 9/11/17.
 */
public class HelpAvenger {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(reader.readLine());
            boolean primeCheck[] = HelpAvenger.checkPrime();
            while (testCase-->0){
                int n = Integer.parseInt(reader.readLine());
                int num[] = new int[n];
                boolean prime[] = new boolean[n];
                int h = (int) Math.ceil(Math.log(n)/Math.log(2));
                int size = 2 * (int) Math.pow(2,h) -1;
                int tree[] = new int[size];
                String numberStringList [] = reader.readLine().split(" ");
                for(int i=0;i<n;i++) num[i] = Integer.parseInt(numberStringList[i]);
                for(int i=0;i<n;i++){
                    if(primeCheck[num[i]]) prime[i] = true;
                    else prime[i] = false;
                }
                int q = Integer.parseInt(reader.readLine());
                HelpAvenger.build(tree,prime,1,1,n);
                while (q-->0){
                    String queryStringList[] = reader.readLine().split(" ");
                    int x = Integer.parseInt(queryStringList[1]);
                    int y = Integer.parseInt(queryStringList[2]);
                    if(queryStringList[0].equals("C")){
                        num[x-1] = y;
                        HelpAvenger.update(tree,prime,1,1,n,x,primeCheck[y]);
                    }
                    else {
                     System.out.println(HelpAvenger.query(tree,1,1,n,x,y));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void build(int tree[],boolean check[],int node,int start,int end){
        if(start == end){
            if(check[start-1]) tree[node] = 1;
            else  tree[node] = 0;
            return;
        }
        else {
            int mid = (start+end)/2;
            build(tree,check,2*node,start,mid);
            build(tree,check,2*node+1,mid+1,end);
            tree[node] = tree[2*node]+tree[2*node+1];
        }
    }

    public static void update(int tree[],boolean check[],int node,int start,int end,int index ,boolean isPrime){
        if(start == end){
            if(isPrime){
                tree[node] = 1;
            }
            else {
                tree[node] = 0;
            }
            check[index-1] = isPrime;
        }

        else {
            int mid = (start+end)/2;
            if(start <= index && index<=mid){
                update(tree,check,2*node,start,mid,index,isPrime);
            }
            else {
                update(tree,check,2*node+1,mid+1,end,index,isPrime);
            }
            tree[node] = tree[2*node]+tree[2*node+1];
        }
    }


    public static int query(int tree[],int node,int start,int end,int l, int r){
        if(r<start || l>end) return 0;
        if(l<=start && r>=end) return tree[node];
        int mid = (start+end)/2;
        int q1 = query(tree,2*node,start,mid,l,r);
        int q2 = query(tree,2*node+1,mid+1,end,l,r);
        return q1+q2;
    }

    public static boolean[] checkPrime(){
        boolean primeCheck[] = new boolean[1000001];
        for(int i =0;i<1000000;i++) primeCheck[i] = true;
        primeCheck[0] = false;
        primeCheck[1] = false;
        for(int i=2;i<=1000000;i++){
            if(primeCheck[i]){
                for(int j = 2*i;j<=1000000;j+=i) primeCheck[j] = false;
            }
        }
        return primeCheck;
    }
}
