import java.util.*;
import java.lang.*;

 class binaryCheck{
     static boolean isDigit(String s){
         if(s.equals("1") || s.equals("0"))
         return true;
         return false;
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String num[]=s.split("");
        int nums[]=new int[num.length];
        boolean flag=true;
        for(int i=0;i<num.length;i++){
            if(isDigit(num[i]))
            nums[i]=Integer.parseInt(num[i]);
            else
            {
                flag=false;
                break;
            }
        }
        if(flag){
            int count=0,count1=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i+1]==1)
                count++;
            else if(nums[i]==1 && nums[i+1]==0)
            count1++;
        }
        if(count==count1)
        System.out.println("Correct");
        else
        System.out.println("Not Correct");
        }
        else{
            System.out.println("NOt Correct");
        }
        in.close();
    }
} 