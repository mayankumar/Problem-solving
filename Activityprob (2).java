import java.util.*;
class ActivityProb
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}
		int count=0;
		int j=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>=b[j])
				{
					j=i;
					count++;
				}
		}
		System.out.println(count);
	}
}