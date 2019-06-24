import java.util.*;
import java.lang.*;

class subsets{
    static void printsubsets(ArrayList<Integer> a,int p,ArrayList<Integer> ans){
        if(p==a.size())
        {
            for(int i=0;i<ans.size();i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println(" ");
        }
        else
        {
            ans.add(a.get(p));
            printsubsets(a,p+1,ans);
            ans.remove(ans.size()-1);
            printsubsets(a, p + 1, ans);
        }
    }
        
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int q=n;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        while(q-->0)
        a.add(in.nextInt());
        Collections.sort(a);
        printsubsets(a,0,ans);
        in.close();
    }
}