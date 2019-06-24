import java.util.*;
import java.lang.*;

 class Divide{
     static int divideWithoutOperators(int a,int b){
         if(a==0)return 0;
         else if(b==0)return Integer.MAX_VALUE;
         int sign1=a<0?-1:1;
         int sign2 = b < 0 ? -1 : 1;
         a=Math.abs(a);
         b=Math.abs(b);
         int ans=0,i=0;
         while(a>0){
             ans+=1<<i;
             i++;
             a-=ans;
         }
         return ans;
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int x=divideWithoutOperators(a,b);
        System.out.println(x);
        in.close();
    }
} 