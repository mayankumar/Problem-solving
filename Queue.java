import java.util.*;

class Queue
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int z=0;z<t;z++)
		{
			int n,m,k,l;
			n=in.nextInt();
			m=in.nextInt();
			k=in.nextInt();
			l=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			int start=a[0],end=k,mid=0,min,count=0;
			while(start<=end)
			{
				min=m;
				count=m;
				mid=(start+end)/2;
				for(int i=0;i<n;i++)
				{
					if(a[i]>l)
					{
						
					}
				}


			}
		}
	}
}