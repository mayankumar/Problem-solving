import java.util.*;
import java.lang.*;

class oddoccur{
    static int oddoccursearch(ArrayList<Integer> a){
        if(a.size()==1)
        return 0;
        int start=0,end=a.size()-1,mid=0,ans=-1;
        while(start<=end){
            mid=(start+end)/2;
            if((mid==0 && a.get(mid)!=a.get(mid+1)) || (mid==a.size()-1 && a.get(mid)!=a.get(mid-1)))
                return mid;
            else if(mid%2==0)
            {
                if(a.get(mid)==a.get(mid+1))
                start=mid+1;
                else
                {
                    ans=mid;
                    end=mid-1;
                }
            }
            else if(mid%2!=0){
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
        {
            System.out.println("-1");    
        }
        else
        {
            ArrayList<Integer> a = new ArrayList<>();
            int t = n;
            while (t-- > 0)
                a.add(in.nextInt());
            int index = oddoccursearch(a);
            if (index !=-1)
                System.out.println(a.get(index));
            else
                System.out.println("-1");
        }
        in.close();
    }
}