import java.util.*;
import java.lang.*;

 class rMid{
    Static  PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
    Static  PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>();
     public rMid(){
         minHeap=new PriorityQueue();
         maxHeap=new PriorityQueue(1000,Collections.reverseOrder());
     }
     public void addNum(int x){
         maxHeap.offer(x);
         minHeap.offer(maxHeap.poll());
         if(maxHeap.size()<minHeap.size()){
             maxHeap.offer(minHeap.poll());
         }
     }
     public static void modify(){
         if(maxHeap.size()<minHeap.size())
         maxHeap.offer(minHeap.poll());
     }
     public int findMid(){
         if(maxHeap.size()==MinHeap.size()){
             int ret= maxHeap.peek()<minHep.peek()?maxHeap.poll():minHeap.poll();
             modify();
             return ret;
         }
     } 
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String cases[]=s.split(" ");
        for(int i=0;i<cases.length;++i){
            rMid obj=new rMid();
            String temp[]=cases[i].split("");
            for(int j=0;j<teamp.length-1;++j){
            
                if(temp[j]=="-1")
                System.out.println(obj.findMid());
                else
                obj.addNum(Integer.parseInt(temp[j]));
            }
        }
        in.close();
    }
} 