import java.util.*;
import java.lang.*;

class chargedevice{
    static int maxcharge(ArrayList<Integer> a,int i,int count,int k,int b){
        int count1=-1,count2=-1,count3=-1;
        if(i==a.size()-1)
        {
            if(a.get(i)<=k)
            return count+1;
            else
            return count;
        }
        if(a.get(i)<=k)
        {
            count1=maxcharge(a,i+1,count+1,k-a.get(i),b);
            count2=maxcharge(a,i+1,count,k+b,b);
        }
        else
        {
            count3 = maxcharge(a, i + 1, count, k + b, b);
        }

        int max=Math.max(count3,Math.max(count1,count2));
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int b=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(in.nextInt());
        }
        int count=maxcharge(a,0,0,k,b);
        System.out.println(count);
    }
}