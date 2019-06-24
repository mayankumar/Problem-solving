import java.util.*;
class Solution {
    public boolean rotateString(String a, String b) {
        int n=a.length();
        int n1=b.length();
        if(n!=n1)
            return false;
        String temp=a+a;
        String c=new String();
        if(a.equals(b))
            return true;
        int i=temp.indexOf(b);
        if(i>=0)
        	return true;
        else
        return false;
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        Solution s=new Solution();
        boolean output=s.rotateString(a,b);
        System.out.println(output);
    }
}