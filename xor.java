import java.util.*;
import java.lang.*;

 class xor{
     static int findresult(ArrayList<Integer> temp){
            int counter=2;
            int res=temp.get(0)^temp.get(1);
            int flag=2;
            while(counter<temp.size()){
                if(flag==1){
                res=res^temp.get(counter);
                flag++;
                }
                else if(flag==2){
                    res+=temp.get(counter);flag++;
                }
                else{
                    res|=temp.get(counter);
                    flag=1;
                }
                counter++;
            }
            return res;
     }
     static int currMax=-1;
     static void checkmax(int a[],int i,ArrayList<Integer> temp){
         if(i>=a.length)
         return;
         else{int max=-1;
            if(temp.size()>1){
                max=findresult(temp);
            }
            if(max>currMax)
            currMax=max;
            checkmax(a,i+1,temp);
            temp.add(a[i]);
            checkmax(a,i+1,temp);
         }
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            checkmax(a,0,new ArrayList<Integer>());
            if(currMax%2==0)
            System.out.println("EVEN");
            else
            System.out.println("ODD");
        }                
        in.close();
    }
} 