
import java.util.*;

class MinEat
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		ArrayList<Integer> a= new ArrayList<>( );
		int n,h,maxs=Integer.MIN_VALUE,temp=0,count=0;
		int start=0,end,mid=0,ans=0,v;
		for(int i=0;i<t;i++)
		{
			n=in.nextInt();
			h=in.nextInt();
			maxs=Integer.MIN_VALUE;
			for(int j=0;j<n;j++)
			{
				v=in.nextInt();
				a.add(v);
				if(v>maxs)
					maxs=v;
			}
			start=1;end=maxs;
			while(start<=end)
			{
				count=0;
				mid=(start+end)/2;
				count=0;
				for(int j=0;j<n;j++)
				{
					if(a.get(j)>=mid)
				{
					int rem= a.get(j) % mid;
					count+= (rem==0? (a.get(j)/mid) : (a.get(j)/mid)+1);
				}
				else
				count++;
				/*temp+=(int)(Math.ceil((arr.get(k)*1.0)/mid));*/
				}
				if(count<=h)
					{end=mid-1;ans=mid;}
				else
					start=mid+1;
			} 
			System.out.println(ans);
		}
	}
}