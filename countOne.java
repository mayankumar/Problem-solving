import java.util.*;

class countOne
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		int count=0;
		long x;
		ArrayList<Long> a=new ArrayList<>();
		while(n>0)
		{
			x=n%2;
			a.add(x);
			n=n/2;
		}
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)==1)
				count++;
			else
				continue;
		}
		System.out.println(count);
	}
}