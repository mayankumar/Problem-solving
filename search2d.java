import java.util.*;
import java.lang.*;

class search2d{
    static ArrayList<Integer> searchmatrix(ArrayList<ArrayList<Integer>> a,int k){
        int n=a.get(0).size();
        int m=a.size();
        ArrayList<Integer> ans=new Arraylist<>();
        int start=0,end=m-1,mid=0;
        int ind=n-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(a.get(mid).get(ind)==k)
            {
                ans.add(mid);
                ans.add(ind);
                return ans;
            }
            else if(a.get(mid).get(ind)>k)
            end=mid-1;
            else
            start=mid+1;
        }
        ind=start;
        start=0;end=n-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(a.get(ind).get(mid)==k)
            {
                ans.add(ind);
                ans.add(mid);
                return ans;
            }
            else if(a.get(ind).get(mid)>k)
            end=mid-1;
            else
            start=mid+1;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                temp.add(in.nextInt());
            }
            a.add(temp);
        }
        int k=in.nextint();
        int ind=searchmatrix(a,k);
        in.close();
    }
}