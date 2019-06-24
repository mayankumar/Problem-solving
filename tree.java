import java.util.*;
import java.util.Queue;
import java.lang.*;

 class tree{
     int data;
     tree left,right;
     tree root;
     tree(int x){
        data=x;
        left=right=null;
     }
     tree(){
        root=null;
     }
     void insert(int y){
         tree t=new tree(y);
         if(root==null)
         {
            root=t;
         }
         else{
             Queue<tree> q=new LinkedList<>();
             q.add(root);
             while(!q.isEmpty()){
                 tree x=q.poll();
                 if(x.left==null)
                 {x.left=t; break;}
                 else if(x.right==null)
                 {
                     x.right=t;break;
                 }
                 else{
                     q.add(x.left);q.add(x.right);
                 }
              }
             
         }
    }
    static boolean checksame(tree a,tree b){
        if(a==null && b==null)
        return true;
        else if(a==null||b==null)
        return false;
        else{
            return (a.data==b.data && checksame(a.left,b.left) && checksame(a.right,b.right));
        }
    }
   static boolean checksym(tree a,tree b){
        if(a==null && b==null)
        return true;
        else if(a==null || b==null)
        return false;
        else
        return (a.data==b.data && checksym(a.left,b.right) && checksym(a.right,b.left));
    }
    static int sumleaf(tree r,int curr){
        if(r!=null && r.left==null && r.right==null)
        {
            curr=curr*10+r.data;
            return curr;
        }
        else{
            
            curr=curr*10+r.data;
            int sum=0;
            if(r.left!=null)
            sum+=sumleaf(r.left,curr);
            if(r.right!=null)
            sum+=sumleaf(r.right,curr);
            return sum;   
        }
    }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       // int m=in.nextInt();
        tree r1=new tree();
        //tree r2=new tree();
        for(int i=0;i<n;i++)
        r1.insert(in.nextInt());
        /*for (int i = 0; i < n; i++)
            r2.insert(in.nextInt());*/
       /* boolean equal=checksame(r1.root,r2.root);
        System.out.println("Are Equal: "+equal);*/
        boolean sym=checksym(r1.root.left,r1.root.right);
        System.out.println("Are symmetric: "+sym);
        in.close();
    }
} 