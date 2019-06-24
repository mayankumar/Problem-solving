import java.util.*;
class findone
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if (arr[Math.abs(arr[i])] >= 0) 
      		arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
		}
		for(int i=0;i<n;i++)
		{
			if (arr[Math.abs(arr[i])] >= 0) 
      		System.out.println(Math.abs(arr[i]));
		}
	}
}