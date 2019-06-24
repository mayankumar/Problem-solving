import java.util.*;
import java.lang.*;

 class minsteps{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(in.nextInt());
            b.add(in.nextInt());
        }
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            int dif1=Math.abs(a.get(i)-a.get(i+1));
            int dif2=Math.abs(b.get(i)-b.get(i+1));
            sum+=(int)Math.floor(Math.sqrt(dif1*dif1+dif2*dif2));
        }
        System.out.println(sum);
        in.close();
    }
} 