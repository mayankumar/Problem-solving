//find nearest smallest element to lthe left;
import java.util.Scanner;
import java.util.Stack;

class nearSmaller
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			long a[]=new long[n];
			long b[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=in.nextLong();
				b[i]=-1;
			}
			Stack<Long> s=new Stack<>();
			for(int i=a.length-1;i>=0;i--)
			{
				while(!s.isEmpty() && s.peek()>=a[i])
					s.pop();
				s.push(a[i]);
				if(!s.isEmpty())
					b[i]=s.peek();
				s.push(a[i]);
				
			}
			for(int i=0;i<n;i++)
				System.out.print(b[i]+" ");
			System.out.println(" ");
		}

	}
}