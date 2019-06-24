import java.util.*;
import java.lang.*;

 class printonetwo{
     static void printf(int x,int k){
         if(x==k){
             return;
         }
         else
         {
             int flag=0;
             int a=x;
             while(a>0)
             {
                 if(a%10==1 || a%10==2)
                 a=a/10;
                 else
                 {
                     flag=1;
                     a=0;
                 }
             }
             if (flag != 1)
                System.out.println(x);

            printf(x + 1, k);
         }
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        printf(1,n);
        in.close();
    }
} 