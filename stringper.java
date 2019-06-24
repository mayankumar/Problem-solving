import java.util.*;
import java.lang.*;

class stringper{
    static void printperm(char a[],char h[],int x){
        if(x==a.length)
        {
            for(int i=0;i<h.length;i++)
            System.out.print(h[i]+" ");
            h=new char[a.length+1];
        }
        else
        {
            for(int i=x;i<a.length;i++)
        {
            h[x]=a[i];
            char temp=a[x];
            a[x]=a[i];
            a[i]=temp;
            printperm(a,h,i+1);
                temp = a[i];
                a[i] = a[x];
                a[x] = temp;
        }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char c[]=s.toCharArray();
        char h[]=new char[s.length()+1];
        printperm(c,h,0);
        in.close();
    }
}