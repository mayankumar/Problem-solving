import java.util.*;

class Sequence
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int z=0;z<t;z++)
		{
			int n=in.nextInt();
			int k=in.nextInt();
			int a[]=new int[n];
			int count=0;
			for(int i=0;i<n;i++)
			{
				a[i]=in.nextInt();
				if(a[i]==1)
				count++;
			}
			if(count+k>=n)
			System.out.println("YES");
			else
			System.out.println("NO");
		}
	}
}