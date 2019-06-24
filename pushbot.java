import java.util.*;
import java.lang.*;

 class pushbot{
     static void pushbottom(Stack<Integer> s,int k){
         if(s.isEmpty())
         s.push(k);
         else{
             int y=s.pop();
             pushbottom(s, k);
             s.push(y);
         }
     }
    /* static revstack(Stack<integer> s,int k);
     {
         if(s.isEmpty())
         s.push(k);
         else{
             int y=s.pop();
             revstack(s,k);

         }
     }*/

     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        s.push(in.nextInt());
        int i=0;
        while(i<s.size())
        {
            int k=s.pop();
            pushbottom(s,k);
            i++;

        }
        while(!s.isEmpty())
            System.out.print(s.pop()+" ");
        in.close();
    }
} 