
import java.lang.*;
import java.util.*;
public class rotate{
    // DO NOT MODIFY THE LIST
    public static int search(ArrayList<Integer> a, int b) {
        int n=a.size();
        int start=0,end=n-1,mid=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(a.get(mid)==b)
            return mid;
            else if(a.get(start)>a.get(end))
            start=mid+1;
            else
            end=mid-1;
        }
        System.out.println(start);
        System.out.println(end);
        if(a.get(start)>b || a.get(end)<b)
        return -1;
        else if(a.get(0)<=b && a.get(end)>=b)
        start=0;
        else if(a.get(start)<=b && a.get(n-1)>=b)
        end=n-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(a.get(mid)==b)
            return mid;
            else if(a.get(mid)<b)
            start=mid+1;
            else
            end=mid-1;
        }
       
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
            a.add(in.nextInt());

        int index=search(a,k);
        System.out.println(index);
    }
}
