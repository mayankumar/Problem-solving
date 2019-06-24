import java.util.*;
import java.lang.*;

class mindomination{
    static int mincoins(ArrayList<Integer> d,int k,int sum,int count){
        if(sum==k)
        {
            return count;
        }
        else if(sum>k)
        return Integer.MAX_VALUE;
        
            int a[]=new int[d.size()];
            ArrayList<Integer> b=new ArrayList<>();
            for(int i=0;i<d.size();i++)
            {
                a[i]=mincoins(d,k,sum+d.get(i),count+1);
                b.add(a[i]);
               // System.out.println(a[i]);
            }

            return Collections.min(b);
        
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> d=new ArrayList<>();
        for(int i=0;i<n;i++)
        d.add(in.nextInt());
        int k=in.nextInt();
        int mincount=mincoins(d,k,0,0);
        System.out.println(mincount);
        in.close();
    }
}