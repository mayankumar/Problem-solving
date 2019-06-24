/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class PairSum {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
	while(t-->0)
	{
	    int n,m;
	    n=in.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    a[i]=in.nextInt();
	    m=in.nextInt();
	    Arrays.sort(a);
	    int pos=-1;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]>m)
	        {
	            pos=i;
	            break;
	        }
	        else
	        	continue;
	    }
	    if(pos==-1)
	    pos=n-1;
	    int i=0,j=pos,flag=0;
	    while(i<j)
	    {
	        if(a[i]+a[j]==m)
	        {
	            flag=1;
	            System.out.println(a[i]+" "+a[j]+" "+m);
	            if(j-1>0 && a[i]+a[j-1]<=m)
	            j--;
	            else if(i+1<n && a[i+1]+a[j]>=m)
	            i++;
	        	else 
	        		continue;
	        }
	        else if(a[i]+a[j]>m)
	        j--;
	        else if(a[i]+a[j]<m)
	        i++;
	    }
	    if(flag==0)
	    System.out.println("-1");
	}
	}
}