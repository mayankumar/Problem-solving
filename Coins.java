import java.util.*;

class Coins
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int coin[]={1,2,5,10,20,50,100};
		int v=in.nextInt();
		Arrays.sort(coin);
		int count=0;
		for(int i=coin.length-1;i>=0;i--)
		{
			if(v==0)
				break;
			else if(coin[i]<=v)
			{
				count+=v/coin[i];
				v=v%coin[i];
			}
			
		}
		System.out.println(count);
	}
}