import java.util.*;
import java.lang.*;

 class largestrectmatrix{
     static void prefixsum(int a[][]){
         int n=a[0].length;
         int m=a.length;
         for(int i=0;i<n;i++){
             for(int j=1;j<m;j++)
            {
                if(a[j][i]==1)
                    a[j][i] += a[j - 1][i];
            }
         }
     }
     static int findmaxarea(int[] a){
         Stack<Integer> s=new Stack<>();
         int n=a.length;
         int next[]=new int[n];
         int prev[]=new int[n];
         
         for(int i=0;i<n-1;i++){
             while(!s.isEmpty() && a[s.peek()]>=a[i])
             s.pop();
             if(s.isEmpty())
             prev[i]=-1;
             else
             prev[i]=s.peek();

             s.push(i);
         }
         s=new Stack<Integer>();
         for(int i=n-1;i>=0;i--){
             while(!s.isEmpty() && a[s.peek()]>=a[i])
             s.pop();
             if(s.isEmpty())
             next[i]=n;
             else
             next[i]=s.peek();

             s.push(i);
         }
         int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++)
         {max=Math.max(max,(next[i]-prev[i]-1)*a[i]);}

         return max;
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            a[i][j]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+" ");
            System.out.println(" ");
        }
        prefixsum(a);
        System.out.println("");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+" ");
            System.out.println(" ");}
        int max=Integer.MIN_VALUE;
        for(int i=m-1;i>=0;i--)
        max=Math.max(max,findmaxarea(a[i]));
        

        System.out.println(max);
        in.close();
    }
} 