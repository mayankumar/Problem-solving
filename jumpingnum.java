import java.util.*;
import java.util.Queue;
import java.lang.*;

 class jumpingnum{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<10;i++)
        q.add(i);
        int i=q.peek();
        if(n>0)
        
        System.out.print(0+" ");
        while(i<=n)
        {
            int x=q.poll();
            System.out.print(x+" ");
            if(x%10==0)
            {
                int t =x%10;
                t=x*10+(t+1);
                q.add(t);
            }

            else if(x%10==9)
            {
                int m=x%10;
                m=x*10+(m-1);
                q.add(m);
            }
            else 
            {
                int t=x%10;
                t=x*10+(t-1);
                q.add(t);
                int m=x*10+(x%10+1);
                q.add(m);   
            }
            i=q.peek();
        }

        in.close();
    }
} 
