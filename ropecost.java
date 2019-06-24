import java.util.*;

class ropecost
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<m;i++)
			a.add(in.nextInt());
		Collections.sort(a);
		int cost=0,tempcost;
		int i=0;
		while(a.size()>1)
		{
			tempcost=a.get(i)+a.get(i+1);
			cost+=tempcost;
			a.remove(i);
			a.remove(i);
			a.add(tempcost);
			Collections.sort(a);
		}
		System.out.println(cost);
	}
}