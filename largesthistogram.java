import java.util.*;
import java.lang.*;

 class largesthistogram{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a =new ArrayList<>();
        for(int i=0;i<n;i++)
        a.add(in.nextInt());
        ArrayList<Integer> next =new ArrayList<>();
        ArrayList<Integer> prev=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && a.get(s.peek())>=a.get(i))
            s.pop();
            if(s.isEmpty())
            next.add(n);
            else
            next.add(s.peek());
            s.push(i);
        }
        Collections.reverse(next);
        s=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            while (!s.isEmpty() && a.get(s.peek()) >= a.get(i))
                s.pop();
            if (s.isEmpty())
                prev.add(-1);
            else
                prev.add(s.peek());
            s.push(i);
        }
        long max=Integer.MIN_VALUE;
        long temp,temp1,left,right,h1,h2;
        for(int i=0;i<n;i++)
        {
            /*temp=a.get(i);
            if(next.get(i)!=-1)
            {
                right=next.get(i)-i;
                h1=a.get(next.get(i));
            }
            else
            {
                right=n-1-i;
                h1=a.get(i);
            }
            if(prev.get(i)!=-1)
            {
                left=i-prev.get(i);
                h2=a.get(prev.get(i));
            }
            else
            {
                left=i-0;
                h2=a.get(i);
            }
            long height=Math.min(a.get(i),Math.min(h1,h2));
            temp1=(left+right+1)*height;
            max=Math.max(max,Math.max(temp,temp1));*/
            max=Math.max(max,(next.get(i)-prev.get(i)-1)*a.get(i));
        }
        System.out.println(max);

        in.close();
    }
} 
//6 4 2 7 8 9
//1 2 -1 -1 -1 -1
//-1 -1 -1 2 3 4