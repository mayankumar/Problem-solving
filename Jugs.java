import java.util.*;
import java.lang.Math;

class Jugs
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		long ar[]=new long[32];
		for(int i=0;i<32;i++)
		{
			ar[i]=(long)Math.pow(2,i);
		}
		while(t-->0)
		{
			long n=in.nextInt();
			int k=in.nextInt();
			ArrayList<Long> a=new ArrayList<>();
			while(n>0)
			{
				a.add(n%2);
				n=n/2;
			}
			Collections.reverse(a);
			while(k>1 && a.size()!=0)
			{
				if(a.get(0)==1)
				{
					k--;
					a.remove(0);
				}
				else
				{
					a.remove(0);
					continue;
				}
			}
			if(a.size()==0)
			{
				System.out.println("0");
				continue;
			}
			int i=0;
			while(a.get(i)!=1)
			{
				a.remove(i);
			}
			if(a.size()==0)
			{
				System.out.println("0");
				continue;
			}
			long sum=0;
			Collections.reverse(a);
			for(int j=0;j<a.size();j++)
			{
				sum+=a.get(j)*ar[j];
			}
			long res=ar[a.size()]-sum;
			System.out.println(res);
		}
	}
}