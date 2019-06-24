import java.util.*;
import java.lang.*;

class MinHeap{
	static PriorityQueue<Integer> heap=new PriorityQueue<Integer>();

	public static void main(String[] args) {
		int a[]={15,75,32,16,85,2};
		for (int i=0;i<a.length ;i++ ) {
			heap.add(a[i]);
			System.out.println(heap.peek());
		}
		System.out.println("Elements popping: ");
		while(!heap.isEmpty())
			System.out.println(heap.poll());
	}
}

/*class MinHeap{
	private int h[];
	private int maxsize,size;
	MinHeap(int maxsize)
	{
		this.maxsize=maxsize;
		this.size=0;
		h=new int[this.maxsize+1];
		h[0]=Integer.MIN_VALUE;
	}
	
	private int parent(int curr)
	{return curr/2;}
	private int left(int curr)
	{return curr*2;}
	private int right(int curr)
	{return curr*2+1;}
	private void swap(int curr,int next)
	{
		int temp=h[curr];
		h[curr]=h[next];
		h[next]=temp;
	}
	void insert(int data)
	{
		if(size>=maxsize)
		{
			System.out.println("Overflow!!");
			return;
		}
		/*Scanner in=new Scanner(System.in);
		System.out.println("Enter data");*//*
		size++;
		h[size]=data;
		int curr=size;
		while(h[curr]<h[parent(curr)])
		{
			swap(curr,parent(curr));
			curr=parent(curr);
		}
	}
	int sizer()
	{return size;}

	private boolean isLeaf(int curr)
	{
		if(curr>size/2 && curr<=size)
			return true;

		return false;
	}

	private void heapify(int curr)
	{
		if(size<=1)
			return;
		if(!isLeaf(curr))
		{
			if(h[curr]>h[left(curr)]||h[curr]>h[right(curr)])
			{
				if(h[left(curr)]<h[right(curr)])
				{
					swap(curr,left(curr));
					heapify(left(curr));
				}
				else
				{
					swap(curr,right(curr));
					heapify(right(curr));	
				}
			}
		}
	}

	int pop()
	{
		if(size<=0)
		{
			System.out.println("Underfllow");
			return -1;
		}
		int f=1;
		int rem=h[f];
		h[1]=h[size];
		size--;
		heapify(1);
		return rem;
	}
	void print()
	{
		if(size<=0)
		{
			System.out.println("Underflow");
			return;
		}
		for(int i=1;i<=size;i++)
			System.out.print(h[i]+" ");
	}
	public static void main(String[] args) {
		MinHeap mh=new MinHeap(10);
		mh.insert(2);
		mh.insert(45);
		mh.insert(1);
		mh.insert(25);
		mh.insert(36);
		mh.insert(23);
		mh.insert(12);
		mh.insert(56);
		mh.insert(15);
		mh.print();
		int s=mh.sizer();
		while(s>0)
		{
			System.out.println(mh.pop());
			s--;
		}
	}

}*/