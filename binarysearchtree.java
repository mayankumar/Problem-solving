import java.util.*;
import java.lang.*;

class node
{
	int data;
	node left,right;
	node(int x)
	{
		data=x;
		left=right=null;
	}
	
}
class binarysearchtree{
	static node root=null;
	
	public static void insert(int x){
		if(root==null)
		{
			root=new node(x);
			return;
		}
		node curr=root;
		node one=new node(x);
		while(curr!=null)
		{
			if(x>curr.data)
				{
					if(curr.right!=null)
					curr=curr.right;
					else
						{
							curr.right=one;
							break;
						}
				}
			else{
				if(curr.left!=null)
					curr=curr.left;
				else
					{
						curr.left=one;
						break;
					}
			}
		}
	}

	void inorder(node curr)
	{

		if(curr==null)
			return;
			inorder(curr.left);
			System.out.print(curr.data+" ");
			inorder(curr.right);

	}
	static node minimum(node curr)
	{
		while(curr!=null && curr.left!=null)
		curr=curr.left;

		return curr;
	}

	static void del(int x)
	{
		node curr=root,prev=null;
		if(curr==null)
		System.out.println("Underflow!!");

		while(curr!=null)
		{
			if(curr.data==x)
			{
				if(curr.left==null && curr.right==null)
				{
					if(prev==null)
					root=null;
					else if(prev.left==curr)
					prev.left=null;
					else if(prev.right==curr)
					prev.right=null;
					
					//FREE_MEM(curr);
					return;
				}

				else if(curr.left!=null && curr.right==null)
				{
					if(prev==null)
					root=curr.left;
					else if(prev.left==curr)
					prev.left=curr.left;
					else if(prev.right==curr)
					prev.right=curr.left;
					//FREE_MEM(curr);
					return;
				}
				else if (curr.right != null && curr.left==null) {
					if(prev==null)
					root=curr.right;
					else if (prev.left == curr)
						prev.left = curr.right;
					else if (prev.right == curr)
						prev.right = curr.right;
						//FREE_MEM(curr);
						return;
				}
				else if(curr.right!=null && curr.left!=null)
				{
					if(root==curr)
					{
						node min=minimum(curr.right);
						int temp=min.data;
						del(temp);
						root.data=temp;
					}
					else{
						node minp = minimum(curr.right);
						int tempv = minp.data;
						del(tempv);
						curr.data = tempv;
					}
					
					return;
				}
			}
			if(x>curr.data)
			{
				prev=curr;
				curr = curr.right;
			}
			else if(x<curr.data)
			{
				prev = curr;
				curr=curr.left;}
		}
		
		System.out.println("Element doesn't Exist!!");
		
	}

	static void search(int x){
		node curr=root;
		if(curr==null)
		{
			System.out.println("Underflow!!");
			return;
		}
		int n=1;
		while(curr!=null)
		{
			if(x==curr.data)
			{
				System.out.println("Element found at: "+n+" level");
				return;
			}
			else if(x>curr.data)
			{
				curr=curr.right;
				n++;
			}
			else
			{
				curr=curr.left;
				n++;
			}
		}

		System.out.println("Element does not exist in this binary tree!!");

	}

	static void lca(int x,int y)
	{
		if(root==null)
		{
			System.out.println("Underflow!!");
			return;
		}
		if(x>y)
		{
			x+=y;
			y=x-y;
			x=x-y;
		}
		node curr=root;
		while(curr!=null)
		{
			if(curr.data<y && curr.data>x)
			{
				System.out.println(curr.data+" is the lowest common ancestor");
				return;
			}
			else if(curr.data>y)
			curr=curr.left;
			else
			curr=curr.right;
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//binarysearchtree t=new binarysearchtree();
		int n=1,x;
		while(n!=6)
		{
			System.out.println("\n1. Insert \n2. Delete \n3.Search \n4.Print \n5. LCA \n6. Exit ");
			n=in.nextInt();
			switch (n) {
				case 1:x=in.nextInt(); insert(x);break;
				case 2:x = in.nextInt();del(x);break;
				case 3:x = in.nextInt();search(x);break;
				case 4:inorder(root);break;
				case 5:x=in.nextInt();int y=in.nextInt();lca(x,y);break;
				case 6:System.out.println("Exiting");break;
				default:System.out.println("wrong Choice!!");
					break;
			}
		}
		in.close();
	}
}