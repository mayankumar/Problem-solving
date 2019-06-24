import java.util.*;
import java.lang.*;

class MaxHeap{
	static PriorityQueue<Integer> heap=new PriorityQueue<Integer>(new Comparator<Integer>(){
			@Override
			public int compare(Integer a,Integer b){
			return b-a;}
		});

	public static void main(String[] args) {

		int a[]={2,9,1,8,4,3,7,5,15};
		for(int i=0;i<a.length;i++)
		{
			heap.add(a[i]);
			System.out.println(heap.peek());
		}

		System.out.println("Removing elements: ");
		while(!heap.isEmpty())
			System.out.println(heap.poll());
	}
}
/*
class MaxHeap{
	 public class Node{
	int pid=0,pr=0;
	Node(int pid,int pr)
	{
		this.pid=pid;
		this.pr=pr;}
	}
	private Node[] h;
	private int size;
	private int maxsize;
	 private static final int FRONT = 1;
	 int sizer()
	 {
	 	return size;
	 } 
  
    public MaxHeap(int maxsize) 
    { 
        this.maxsize=maxsize; 
        this.size=0; 
        h=new Node[this.maxsize + 1]; 
        h[0]=new Node(0,Integer.MAX_VALUE);
    } 
     private int parent(int pos) 
    { 
        return pos / 2; 
    } 
   
    private int leftChild(int pos) 
    { 
        return (2 * pos); 
    } 
   
    private int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
  
    private boolean isLeaf(int pos) 
    { 
    	int x=size/2;
        if (pos>(x) && pos<=size) { 
            return true; 
        } 
        return false; 
    } 
   
    private void swap(int fpos, int spos) 
    { 
        Node tmp=h[fpos]; 
        h[fpos] = h[spos]; 
        h[spos] = tmp; 
       // System.out.println("Printing changing value:");
        //System.out.println(h[spos].pr);
    } 
    private void maxHeapify(int pos) 
    { 
  		if(size<=1)
  			return;
        if(!isLeaf(pos)) { 
            if (h[pos].pr < h[leftChild(pos)].pr 
                || h[pos].pr < h[rightChild(pos)].pr) { 

                if (h[leftChild(pos)].pr > h[rightChild(pos)].pr) { 
                    swap( leftChild(pos),pos); 
                    maxHeapify(leftChild(pos)); 
                } 
                else { 
                    swap(rightChild(pos),pos); 
                    maxHeapify(rightChild(pos));
                } 
            } 
        } 
    } 
 
    public void insert(int element,int priority) 
    { 
    	if(size==maxsize)
    	{
    		System.out.println("Overflow!!");
    		return;
    	}
    	size++;
        h[size]=new Node(element,priority); 
        int current = size; 
        while (h[current].pr>h[parent(current)].pr) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    } 
   /* public void maxHeap() 
    { 
        for (int pos = (size / 2); pos >= 1; pos--) { 
            maxHeapify(pos); 
        } 
    } 

    public int remove() 
    { 
    	if(size==0)
    		{
    			System.out.println("Underflow");
    			return -1;
    		}
        int priority = h[FRONT].pr; 
        h[FRONT] = h[size--]; 
        maxHeapify(FRONT); 
        return priority; 
    } 
   public void print() 
    { 
    	if(size==0)
    		{
    			System.out.println("Underflow");
    			return;
    		}
        for (int i = 1; i <= size; i++) { 
           System.out.println(h[i].pr);
        } 
    } 
    int top()
    {
    	if(size==0)
    		{
    			System.out.println("Underflow");
    			return -1;
    		}
    	return h[1].pr;
    }
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter max size for the heap");
    	int maxs=in.nextInt();
    	int choice=1;
    	MaxHeap mh=new MaxHeap(maxs);
    	while(choice!=6)
    	{
    		System.out.println("\n 1.Insert \n 2.GetTop \n 3.Remove \n 4.print \n 5.Sort \n 6. Exit");
    	choice=in.nextInt();
    	switch(choice)
    	{
    		case 1:int data=in.nextInt();int pr=in.nextInt();
    				mh.insert(data,pr);
    				break;
    		case 2:System.out.println(mh.top());break;
    		case 3:int x=mh.remove();
    				System.out.println("Removed element: "+x);break;
    		case 4:mh.print();break;
    		case 5:int s=mh.sizer();
    			
    				while(s>0)
    				{
    					x=mh.remove();
    				System.out.println("Removed element: "+x);
    				s--;
    				}
    				break;
    		default:System.out.println("wrong choice");
    	}
    	}
    }
 
}*/