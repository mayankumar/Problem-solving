import java.util.*;
import java.lang.*;

 class prevgreat{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
            a.add(in.nextInt());

        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            while(!s.isEmpty() && a.get(i)>=a.get(s.peek()))
            s.pop();
            if(s.isEmpty())
            ans.add(-1);
            else
            ans.add(s.peek());
            s.push(i);
        }
        a=new ArrayList<Integer>();
        for(int i=0;i<ans.size();i++)
        {
            //System.out.print(ans.get(i) + " ");
            if(ans.get(i)==-1)
            {
                int t=i+1;
                a.add(t);
            }
            else
            {
                int t=i-ans.get(i);
                a.add(t);
            }
       }
        for (int i = 0; i < a.size(); i++)
        System.out.print(a.get(i)+" ");

        in.close();
    }
} 