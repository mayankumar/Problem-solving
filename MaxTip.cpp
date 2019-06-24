#include<algorithm>
using namespace std;
struct tip
{
    int a;
    int b;
    int d;
};
bool compared(tip x,tip y)
{
    return (x.d<y.d);
}
int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n,x,y;
	    cin>>n>>x>>y;
	    int ar[n],br[n];
	    tip s[n];
	    for(int i=0;i<n;i++)
	    cin>>ar[i];
	    for(int i=0;i<n;i++)
	    cin>>br[i];
	    for(int i=0;i<n;i++)
	    {
	        s[i].a=ar[i];
	        s[i].b=br[i];
	        s[i].d=abs(s[i].a-s[i].b);
	    }
	    int sum=0;
	    sort(s,s+n,compared);
	    for(int i=n-1;i>=0;i--)
	    {
	        if(s[i].a>=s[i].b)
	        {
	            if(x>0)
	            {
	               sum+=s[i].a;
	               x--;
	            }
	            else
	            {
	                sum+=s[i].b;
	                y--;
	            }
	        }
	        else if(s[i].b>s[i].a)
	        {
	            if(y>0)
	            {
	               sum+=s[i].b;
	               y--;
	            }
	            else
	            {
	                sum+=s[i].a;
	                x--;
	            }
	        }
	    }
	    cout<<sum<<endl;
	}
	return 0;
}