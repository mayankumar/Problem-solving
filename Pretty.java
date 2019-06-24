import java.util.*;
import java.lang.*;

public class Pretty {
    public static ArrayList<ArrayList<Integer>> prettyPrint(int n) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        int s=n-1;
        s+=n;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            temp.add(1);
            
            a.add(temp);
            temp=new ArrayList<Integer>();
        }
        for(int i=0;i<a.size();i++)
    	{
    		for(int j=0;j<a.size();j++)
    			System.out.print(a.get(i).get(j));
    		System.out.println(" ");
    	}
        int k=n;
       s=s-1;;
        for(int i=0;i<(s+1)/2;i++)
        {
            for(int j=i;j<s-i;j++)
            {
                a.get(i).set(j,k);
                a.get(j).set(s-i,k);
                a.get(s-i).set(s-j,k);
                a.get(s-j).set(i,k);
            }
            k--;
        }
        
        return a;
    }
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt();
    	ArrayList<ArrayList<Integer>> a=prettyPrint(n);
    	for(int i=0;i<a.size();i++)
    	{
    		for(int j=0;j<a.size();j++)
    			System.out.print(a.get(i).get(j));
    		System.out.println(" ");
    	}
    }
}
