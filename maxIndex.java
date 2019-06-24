import java.util.*;

class maxIndex
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			int max=0,k;
			int i=0,j=n-1;
			while(i<=j)
			{
				if(a[i]<=a[j])
				{
					max=j-i;
					break;
				}
				 else if(a[i]<=a[j-1])
				 	j--;
				 else
				 	i++;
			}
			System.out.println(max);
		}	
	}
}