import java.util.*;
import java.lang.*;
class node{
    int data;
    node next;
    node head,tail;
    node(int x){
        data=x;
        next=null;
    }
    node(){
        head=null;
        tail=null;
    }
    void insert(int x){
        node t = new node(x); 
        if(head==null)
         {
            head=t;
            tail=head;
         }
         else
         {
            tail.next=t;
            tail=t;   
         }
     }
     void print(){
         if(head==null)
         {
             System.out.println("underflow");
             return;
         }
         else
         {
             node curr=head;
             while(curr!=null){
                 System.out.print(curr.data+" ");
                 curr=curr.next;
             }
             System.out.println("");
         }
     }
}
 public class mergetwolist{
     static node mergetwosortedlist(node a,node b){
        // a.print();b.print();
         if(a==null)
         return b;
         else if(b==null)
         return a;
         node ans=null;;
         node cur=a.head,cur2=b.head;
         if(cur.data<=cur2.data)
         {
             ans=cur;
             cur=cur.next;
             ans.next=null;
         } 
         else{
             node temp = cur2.next;
             ans=cur2;
             ans.next=null;
             cur2=temp;
         }
         node last=ans;
         while(cur!=null && cur2!=null){
             if(cur.data<=cur2.data)
         {
             node temp=cur.next;
             last.next=cur;
            cur=temp;
             last=last.next;
             last.next=null;
             ans.print();
                
         } 
         else{
             node temp=cur2.next;
             last.next=cur2;
                cur2 = temp;
             last=last.next;
             last.next=null;
            }
         }
         if(cur!=null)
         {
             last.next=cur;
         }    
         else if(cur2!=null){
             last.next=cur2;
         }
         //ans.print();
         return ans;
     }
     
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        node head1=new node();
        node head2=new node();
        for(int i=0;i<n;i++){
            head1.insert(in.nextInt());
        }
        for (int i = 0; i < m; i++) {
            head2.insert(in.nextInt());
        }
        /*head1.print();
        head2.print();*/
        node ans=new node();
        ans=mergetwosortedlist(head1,head2);
        ans.print();
        in.close();
    }
} 