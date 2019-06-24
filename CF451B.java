import java.util.*;
import java.lang.*;

 class CF451B{
     static int[] rev(int a[],int start,int end){
         for(int i=start,j=end;i<j;++i,--j){
             int temp=a[i];
             a[i]=a[j];
             a[j]=temp;
         }
         return a;
     }
     static boolean checkSorted(int a[]){
         for(int i=1;i<a.length;++i){
             if(a[i]<a[i-1])
             return false;
         }
         return true;
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int flag=0;
        int start=-1,end=-1;
        for(int i=1;i<n;++i){
            if(a[i]<a[i-1] && flag==0){
                start=i-1;flag=1;
            }
            else if(a[i]>a[i-1] && flag==1){
                end=i-1;break;
            }
        }
        if(end==-1)
        end=n-1;
        a=rev(a,start,end);
        if(checkSorted(a)){
            System.out.println("yes");
            System.out.println(++start+" "+(++end));
        }
        else
        System.out.println("no");
        in.close();
    }
} 