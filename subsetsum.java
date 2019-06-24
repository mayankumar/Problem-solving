import java.util.*;
import java.lang.*;

class subsetsum{
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        a.add(in.nextInt());

        int k=in.nextInt();
        int count=countsubset(a,0,0);
        in.close();
    }
}