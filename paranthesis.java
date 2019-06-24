/*package whatever //do not write package name here */

import java.util.*;

class Paranthesis {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int z=0;z<t;z++)
		{
		    String s1=in.nextLine();
		    char ch[]=s1.toCharArray();
		    int n=ch.length;
		    int count=0,flag=1;
		    Stack<Character> s=new Stack<>();
		    for(int i=0;i<n;i++)
		    {
		        if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
		        {
		            s.push(ch[i]);
		            count++;
		        }
		        else
		        {
		            if(!s.empty())
		            {
		            char temp=s.pop();
		            if(temp=='{'&& ch[i]=='}')
		            count--;
		            else if(temp=='('&& ch[i]==')')
		            count--;
		            else if(temp=='['&& ch[i]==']')
		            count--;
		            else
		            {break;}
		        }
		        else
		        	break;
		    }
		}
		    if(count==0)
		    System.out.println("balanced");
		    else
		    System.out.println("not balanced");
		}
	}
}