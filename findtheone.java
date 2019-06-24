//find the element occuring once in array containing three occurences of each elements
import java.util.*;

class findtheone
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long a[]=new long[n];
		int j=1;
		int k=1;
		int ans[]=new int[32];
		while(j<32)
		{
			int sum=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]&k==1)
					sum++;
			}
		}
	}
}