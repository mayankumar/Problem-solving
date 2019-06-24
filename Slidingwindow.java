
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0)
	{
		int n=in.nextInt();
		int k=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			{
				a[i]=in.nextInt();
			}
		Deque<Integer> d=new LinkedList<>();
		int i;
		for(i=0;i<k;i++)
		{
			while(!d.isEmpty() && a[i]>=a[d.peekLast()])
				d.removeLast();
			d.addLast(i);
		}
		
		for(;i<n;i++)
		{
			System.out.print(a[d.peek()]+" ");
			while(!d.isEmpty() && d.peek()<=i-k)
				d.removeFirst();
			while(!d.isEmpty() && a[i]>=a[d.peekLast()])
				d.removeLast();
			d.addLast(i);
		}
		System.out.print(a[d.peek()]);
		System.out.println("");
		d.clear();
	}

	}
}