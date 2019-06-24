public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> comparefunc(final List<Integer> a,int n)
    {
        ArrayList<Integer> s=new ArrayList<>();
        s.add(a.get(0));
        for(int i=1;i<n;i++)
        {
            String t=Integer.toString(a.get(i));
            t+=Integer.toString(a.get(i-1));
            long u=Long.parseLong(t);
            String r=Integer.toString(a.get(i-1));
            r+=Integer.toString(a.get(i));
            long v=Long.parseLong(r);
            if(v>u)
            {
                int ind=s.indexOf(a.get(i-1));
                s.add(ind+1,a.get(i));
            }
            else if(u>=v)
            {
                int ind=s.indexOf(a.get(i-1));
                if(ind==0)
                s.add(0,a.get(i));
                else
                s.add(ind-1,a.get(i));
            }
        }
        return s;
    }
    public ArrayList<Integer> bubble(ArrayList<Integer> a)
    {
        int n=a.size();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                String t=Integer.toString(a.get(j));
                t+=Integer.toString(a.get(j+1));
                long u=Long.parseLong(t);
                String r=Integer.toString(a.get(j+1));
                r+=Integer.toString(a.get(j));
                long v=Long.parseLong(r);
                if(v>u)
                {
                    int tm=a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,tm);
                }
            }
        }
        return a;
    }
    public String largestNumber(final List<Integer> a) {
        int n=a.size();
        String ans=new String();
        ArrayList<Integer> temp=comparefunc(a,n);
        temp=bubble(temp);
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(a.get(i)==0 && flag==0)
            continue;
            else
            flag=1;
            if(a.get(i)>0 || flag==1)
            ans+=Integer.toString(temp.get(i));
        }
        if(ans.length()==0)
        ans+=Integer.toString(0);
        return ans;
    }
}
