import java.util.*;
import java.lang.*;
class searching{
    static int binary(ArrayList<Integer> a,int k){
        int s=0,e=a.size()-1,mid=0;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(a.get(mid)==k)
            return mid;
            else if(a.get(mid)>k)
            e=mid-1;
            else
            s=mid+1;
        }
        if(s>a.size()-1)
        return -1;
        else 
        return s;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        a.add(in.nextInt());
        int k=in.nextInt();
        int ind=binary(a,k);
        if(ind!=-1)
        System.out.println(a.get(ind));
        else
        System.out.println(ind);
        in.close();
    }
}