import java.util.*;
import java.lang.*;

class klargest{
	public static void main(String[] args) {
		PriorityQueue<Integer> h=new PriorityQueue<Integer>();
		int a[]={12,3,5,7,19};
		for(int i=0;i<a.length;i++)
			h.add(a[i]);
		for(int i=0;i<1;i++)
			h.poll();
		System.out.println(h.peek());
	}
}