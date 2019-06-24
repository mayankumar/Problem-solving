import java.util.*;
import java.lang.*;

class pairsearch{
    static int pairs(ArrayList<Integer> a){
        int start=0,end=a.size()-1,mid=0,ans=-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(mid==a.size()-1 && a.get(mid-1)!=a.get(mid) || (mid==0 && a.get(mid+1)!=a.get(mid)))
            return mid;
            else if(mid%2==0)
            {
                if(a.get(mid)==a.get(mid+1))
                start=mid+1;
                else
                {
                    ans = mid;
                    end=mid-1;
                }
            }
            else if(mid%2!=0)
            {
                if(a.get(mid)==a.get(mid-1))
                start=mid+1;
                else
                {
                    ans=mid;
                    end=mid-1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0)
        System.out.println("No");
        else{
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++)
            a.add(in.nextInt());
            int single=pairs(a);
            System.out.println(a.get(single));
        }
        in.close();
    }
}