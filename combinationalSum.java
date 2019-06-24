import java.util.*;
import java.lang.*;

 class combinationalSum{
     static void printcombinations(int a[],int pos,int x[],int sum,int t,int n,int z){
         if(sum==t)
         {
             for(int i=0;i<x.length;i++)
             System.out.print(x[i]+" ");

             System.out.println(" ");
         }
         else if(pos>=n)
         return;
         else if(sum>t)
         return;
         else{
             printcombinations(a,pos+1, x,sum, t,n,z);
             x[z]=a[pos];
             printcombinations(a,pos+1,x,sum+a[pos],t,n,z+1);
         }
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        int t=in.nextInt();
        int []x=new int[n];
        printcombinations(a,0,x,0,t,n,0);
        in.close();
    }
} 