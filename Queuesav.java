import java.util.Queue;
import java.util.LinkedList;

public class Queuesav{
	public static void main(String[] args) {
		int a[]={0,1,2,3,4,0,5,0,0,0,0,0,6,0};
		Queue<Integer> q=new LinkedList<>();
		q.add(a[1]);
		q.add(0);
		int n=a.length;
		for(int i=1;i<a.length/2;i++)
		{
			if(a[i*2]==0 && a[i*2+1]==0 && i==n-1)
				continue;
			if(a[i*2]!=0)
				q.add(a[i*2]);
			if(a[i*2+1]!=0)
				q.add(a[i*2+1]);
			while(!q.isEmpty() && q.peek()!=0)
				{
					System.out.print(q.peek()+" ");
					q.remove();
				}
			System.out.println(" ");
			q.remove();
			q.add(0);
		}
	}
}