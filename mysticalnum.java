import java.util.*;
import java.util.Queue;

 class mysticalnum{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        while(!q.isEmpty())
        {
            //System.out.println(q.peek());
            if(q.peek()<n && q.peek()%k==0)
            {
                System.out.println(q.peek()+" ");
                int x=q.poll();
                int t=x*10;
                int m=x*10+1;
                //System.out.println(t+" "+m);
                q.add(t);
                q.add(m);
            }
            else if(q.peek()<=n)
            {
                int x=q.poll();
                int t = x * 10;
                int m = x * 10 + 1;
                //System.out.println(t + " " + m);
                q.add(t);
                q.add(m);
            }
            else if(q.peek()>n)
            break;
        }
        in.close();
    }
} 