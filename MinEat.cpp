#include<iostream>
using namespace std;
int main()
{
	int t;
	cin>>t;
	for(int j=0;j<t;i++)
		{
			int n,h;
			cin>>n>>h;
			int a[n];
			int max=INT_MIN;
			for(int i=0;i<n;i++)
			{
				cin>>a[i];
				if(a[i]>=max)
					max=a[i];
			}
			int start=0,end=max,mid,count=0,ans=0,temp,r;
			while(start<=end)
			{
				mid=(start+end)/2;
				for(int i=0;i<n;i++)
				{
					temp=a[i];
					if(temp<=mid)
						count++;
					else
					{
						r=temp%mid;
						temp=temp/mid;
						count+=temp;
						if(r!=0)
							count++;
					}
					if(count>h)
						break;
				}
				if(count<=h)
				{
					end=mid-1;ans=mid;
				}
				else
					start=mid+1;
			}
			cout<<ans<<endl;
		}
}