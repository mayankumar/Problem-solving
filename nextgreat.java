import java.util.*;
import java.lang.*;

 class nextgreat{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a =new ArrayList<>();
        for(int i=0;i<n;i++)
        a.add(in.nextInt());

        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--){
            while(!s.isEmpty() && a.get(i)>=s.peek())
            s.pop();
            if(s.isEmpty())
                ans.add(-1);
            else{
                ans.add(s.peek());
            }
            s.push(a.get(i));
        }
        Collections.reverse(ans);
        for(int i=0;i<ans.size();i++)
        System.out.print(ans.get(i)+" ");
        in.close();
    }
} 