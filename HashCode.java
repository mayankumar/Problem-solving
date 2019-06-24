import java.util.*;
import java.lang.*;
import java.io.*;

class Photo{
	char o;
	int num;
	int pid;
	ArrayList<String> tags;
	static int id=0;

	Photo(char v,int s,ArrayList<String> t)
	{
		o=v;num=s;tags=t;pid=id++;
	}
	void print()
	{
		System.out.println("Orientation: "+o);
		System.out.println("pid "+pid);
		System.out.println("Number  of tags: "+num);
		System.out.print("Tags: ");
		for(int i=0;i<tags.size();i++)
			System.out.print(tags.get(i)+" ");

		System.out.println("");
	}

}
class HashCode{
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\The Random Guy\\Desktop\\b_lovely_landscapes.txt");
	Scanner in=new Scanner(f);
	int total=Integer.parseInt(in.nextLine());
	Photo ob[]=new Photo[total];
	for(int i=0;i<total;i++)
	{
		String s[]=in.nextLine().split("\\s+");
		ArrayList<String> temp=new ArrayList<>();
		for(int j=2;j<s.length;j++)
			temp.add(s[j]);
		ob[i]=new Photo(s[0].charAt(0),Integer.parseInt(s[1]),temp);
	}

	for(int i=0;i<total;i++)
	{
		ob[i].print();
	}
	}

}