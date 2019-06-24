import java.util.*;
import java.lang.*;

public class BSTprintllevel{

	public static void main(String[] args) {
		int a[]={0,1,2,3,4,0,5,0,0,0,0,0,6,0};
		Queue<Integer> q = new LinkedList<>(); 
		q.add(a[1]);
		q.add(0);
		int n=a.length;
		for(int i=1;i<a.length;i++)
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
			q.add(0);
		}
}
}

/*import java.util.LinkedList; 
import java.util.Queue; 
  
public class QueueExample 
{ 
  public static void main(String[] args) 
  { 
    Queue<Integer> q = new LinkedList<>(); 
  
    // Adds elements {0, 1, 2, 3, 4} to queue 
    for (int i=0; i<5; i++) 
     q.add(i); 
  
    // Display contents of the queue. 
    System.out.println("Elements of queue-"+q); 
  
    // To remove the head of queue. 
    int removedele = q.remove(); 
    System.out.println("removed element-" + removedele); 
  
    System.out.println(q); 
  
    // To view the head of queue 
    int head = q.peek(); 
    System.out.println("head of queue-" + head); 
  
    // Rest all methods of collection interface, 
    // Like size and contains can be used with this 
    // implementation. 
    int size = q.size(); 
    System.out.println("Size of queue-" + size); 
  } 
} */