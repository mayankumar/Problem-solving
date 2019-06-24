/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int tp;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<t;i++)
		{
		    int n=in.nextInt();
		    for(int j=0;j<n;j++)
		    {
		        tp=in.nextInt();
		        arr.add(tp);
		    }
		    Collections.sort(arr);
            Collections.reverse(arr);
            int sum=0,r=0;
            while(arr.size()!=0)
            {
                sum+=arr.get(r);
                int key=arr.indexOf(arr.get(r)-1);
                if(key!=-1)
                arr.remove(key);
                arr.remove(r);    
            }
            System.out.println(sum);
            arr.clear();
		}
	}
}
