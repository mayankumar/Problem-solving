
import java.util.*;
class Qual{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		int n,k,count=0,i,j;
		for(int m=0;m<t;m++)
		{
			n=in.nextInt();
			k=in.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			count=k;
			i=n-k-1;
			j=n-k;
			while(i>=0)
				{if(a[i]>=a[j]){count++;i--;}
				else
				break;}
			System.out.println(count);
		}
	}
}