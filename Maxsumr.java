import java.util.*;

class Maxsumr
{
	public static int maxSumSubarray(int a[], int n)
         {
             ArrayList<Integer> temp=new ArrayList<>();
             ArrayList<Integer> maxsuma=new ArrayList<>();
             int sum=0,maxsum=Integer.MIN_VALUE;
             for(int i=0;i<n;i++)
             {
                 sum+=a[i];
                 temp.add(a[i]);
                 System.out.println("Sum:"+sum);
                 if(sum>maxsum)
                 {
                     maxsum=sum;
                     System.out.println("Maxsum:"+maxsum);
                     maxsuma=temp;
                 }
                 else if(sum<0)
                 {
                     sum=0;
                     temp=new ArrayList<>();
                 }
             }
             System.out.println(" ");
             int min=Integer.MAX_VALUE;
             maxsuma.remove(maxsuma.size()-1);
             for(int i=0;i<maxsuma.size();i++)
             {
             	System.out.print(maxsuma.get(i)+" ");
                 if(maxsuma.get(i)<=min)
                    min=maxsuma.get(i);
             }
             System.out.println(min);
             if(min<0)
             	maxsum=maxsum+Math.abs(min);
             return maxsum;
         }
         public static void main(String[] args) {
         	Scanner in=new Scanner(System.in);
         	int t=in.nextInt();
         	while(t-->0)
         	{
         		int n=in.nextInt();
         		int a[]=new int[n];
         		for(int i=0;i<n;i++)
         			a[i]=in.nextInt();
         		int sum=maxSumSubarray(a,n);
         		System.out.println(sum);
         	}
         }
}