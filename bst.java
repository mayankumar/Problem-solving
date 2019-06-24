import java.util.*;
import java.lang.*;
class node{
    int val;
    node left,right,root;
    node(int x){
        val=x;
        left=right=null;
    }
    node(){root=null;}
    void insert(int x){
        node temp=new node(x);
        if(root==null){
            root=temp;
            return;
        }
        else{
            node curr=root;
            while(curr!=null){
                if(curr.val<temp.val){
                    if(curr.right!=null)
                    curr=curr.right;
                    else
                    {
                        curr.right=temp;
                        break;
                    }  
                }
                else if(curr.val>temp.val){
                    if(curr.left!=null)
                    curr=curr.left;
                    else{
                        curr.left=temp;
                        break;
                    }
                }
            }
        }
    }
    node findsucc(node curr){
        node p=curr;
        while(curr!=null){
            p=curr;
            curr=curr.left;
        }
        return p;
    }
    int findinordersucc(int k){
        if(root==null){
            System.out.println("Null");
            return 0;
        }
        else{
            node p=null;
            node curr=root;
            while(curr!=null){
                if(curr.val==k){
                    if(curr.right!=null)
                    p=findsucc(curr.right);
                    if(p!=null)
                    return p.val;
                    return 0;
                }
                else if(curr.val>k && curr.left!=null){
                    p=curr;
                    curr=curr.left;
                }
                else
                curr=curr.right;
            }
        }
        return 0;
    }
    void inorder(){
        if(root==null)
        {
            return;
        }
        else
        {
            node x=new node();
            x.root=this.root.left;
            x.inorder();
            System.out.print(root.val+" ");
            x.root=this.root.right;
            x.inorder();
        }
    }
}
 class bst{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        node ob=new node();
        for(int i=0;i<n;i++)
        ob.insert(in.nextInt());
        ob.inorder();
        //int k=in.nextInt();
        //int succ=ob.findinordersucc(k);
        //System.out.println(succ);
        in.close();
    }
} 