import java.util.*;
import java.lang.*;
class rotatesearch{
    static int findkey(ArrayList<Integer> a,int k)
    {
        int start=0,end=a.size()-1,mid=0;int ans=-1;
        while(start<=end)
        {
           mid=(start+end)/2;
           int t=a.get(mid);
           if(t==k)
           return mid;
           else if(t>=a.get(start))
           {
               if(k<t && k>=a.get(start))
               end=mid-1;
               else
               start=mid+1;
           }
           else
           {
               if(k>t && k<=a.get(end))
               start=mid+1;
               else
               end=mid-1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        a.add(in.nextInt());

        int k=in.nextInt();
        int index=findkey(a,k);
        System.out.println(index);
        in.close();
    }
}