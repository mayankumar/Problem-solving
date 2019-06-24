import java.util.Scanner;
import java.lang.Math;

class MaxDif
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int z=0;z<t;z++)
		{
			int n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			a[i]=in.nextInt();
			
			int min=Integer.MAX_VALUE;
			int maxd=Integer.MIN_VALUE;
			int index=0,index1=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]<min)
				{
					index1=index;
					min=a[i];
					index=i;
				}
				if(index!=i && a[i]-a[index]>maxd)
				{
					maxd=a[i]-a[index];
				}
				if(index==n-1)
				{
					if(a[index]-a[index1]>maxd)
						maxd=a[index]-a[index1];
				}
			}
			System.out.println(maxd);

		}
	}
}