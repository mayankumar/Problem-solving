import java.util.*;
class tip
{
	public int a;
	public int b;
	public int d;
	public tip(int a,int b,int d)
	{
		this.a=a;
		this.b=b;
		this.d=d;
	}
}
class diffsort implements Comparator<tip> 
{  
    public int compare(tip a, tip b) 
    { 
        return a.d - b.d; 
    } 
} 
class MaxTip
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int z=0;z<t;z++)
		{
			int n,x,y;
			n=in.nextInt();
			x=in.nextInt();
			y=in.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<n;i++)
				b[i]=in.nextInt();
			ArrayList<tip> arr=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				arr.add(a[i],b[i],Math.abs(a[i]-b[i])); 
			}
			int sum=0;
			Collections.sort(arr,new diffsort());
			Collections.reverse(arr);
			for(int i=n-1;i>0;i--)
			{
				tip t=arr.get(i);
				if(t.a>t.b)
				{
					if(x>0)
					{
						sum+=t.a;
						x--;
					}
					else
					{
						sum+=t.b;
						y--;
					}
				}
				else
				{
					if(y>0)
					{
						sum+=t.b;
						y--;
					}
					else
					{
						sum+=t.a;
						x--;
					}
				}
			}

			System.out.println(sum);
		}
	}
}