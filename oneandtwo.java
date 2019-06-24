import java.util.*;
import java.util.Queue;

 class oneandtwo{
     static void printall(int i,int n){
         if(i>=n)
         return;
         else{
             if(i!=0)
             System.out.println(i+" ");
             printall(i*10+1,n);
             printall(i*10+2,n);
         }
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println();
        //printall(0,n);
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            int m=q.poll();
            if(m<n){
                int t=m*10+1;
            q.add(t);
            t=m*10+2;
            q.add(t);
            }
            else
            break;  
        }
        in.close();
    }
} 