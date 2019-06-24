import java.util.*;
class Solution
{

	public static void main(String[] args) {
	 	Scanner in=new Scanner(System.in);
	 	int n=in.nextInt();
	 	ArrayList<Integer> a=new ArrayList<>();
	 	for(int i=0;i<n;i++)
	 		a.add(in.nextInt());
	 	int maxsize=constantrange(a);
	 	System.out.println(maxsize);
	 } 
	public static int constantrange(ArrayList<Integer> a)
	{
		int n=a.size();
		Deque<Integer> d=new LinkedList<Integer>();
		int maxv=a.get(0),minv=a.get(0),maxsize=Integer.MIN_VALUE;
		d.push(a.get(0));
		for(int i=1;i<n;i++)
		{
			d.addLast(a.get(i));
			if(a.get(i)>maxv)
			maxv=a.get(i);
			else if(a.get(i)<minv)
			minv=a.get(i);
			if(maxv-minv==1)
			{
				if(d.size()>maxsize)
				maxsize=d.size();
			}
			else
			{
				while(!d.isEmpty() && maxv-minv!=1)
				{
					int t=d.removeFirst();
				
					maxv=Collections.max(d);
					
					minv=Collections.min(d);
					
				}
			}
		}
		return maxsize;
	}
}