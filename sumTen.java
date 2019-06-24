import java.util.*;
import java.lang.*;

 class sumTen{
     
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9};
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
        if(n<10)
        System.out.println(n*10-n);
        else{
            int sum=0;int test=1;
            while(n>0 && sum!=10){
                while(test>0){
                    sum+=test%10;
                    test/=10;
                }
                if(sum==10)
                n--;
            }
            System.out.println(test);
        }
    }
        in.close();
    }
} 