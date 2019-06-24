import java.util.*;
class spiral
{
	ArrayList<Integer> spiralMatrix(ArrayList<ArrayList<Integer>> a)
	{
		int k=1;
		ArrayList<Integer> s=new ArrayList<>();
		while(a.size()!=0)
		{
			if(k==1)
			{
				for(int i=0;i<a.get(0).size();i++)
					s.add(a.get(0).get(i));

				a.remove(0);
				k++;
			}
			if(k==2)
			{
				for(int i=0;i<a.size();i++)
				{
					s.add(a.get(i).get(a.get(i).size()-1));
					a.get(i).remove(a.get(i).size()-1);
				}
				k++;
			}
			if(k==3)
			{
				for(int i=a.get(a.size()-1).size()-1;i>=0;i--)
					s.add(a.get(a.size()-1).get(i));

				a.remove(a.size()-1);
				k++;
			}
			if(k==4)
			{
				for(int i=a.size()-1;i>=0;i--)
				{
					s.add(a.get(i).get(0));
					a.get(i).remove(0);
				}
				k=1;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		ArrayList<ArrayList<Integer>> a=new ArrayList<>();
		ArrayList<Integer> t=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
			t=new ArrayList<Integer>();
			for(int j=0;j<n;j++)
				t.add(in.nextInt());
			a.add(t);
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				a.get(i).get(j);
		}
		spiral ob=new spiral();
		ArrayList<Integer> ans=ob.spiralMatrix(a);
		for(int i=0;i<ans.size();i++)
		{
				ans.get(i);
		}		
	}
}