import java.util.*;
 class Unique
 {
 	public static void main(String[] args) {
 		int a[]={1,1,1,1,1,1,2,2,2,3,4,4,4,5,5};
 		int b[]=new int[a.length];
 		int count=1;
 		b[0]=a[0];
 		int key=a[0];
 		for(int i=1;i<a.length;i++)
 		{
 			if(key!=a[i])
 			{
 				key=a[i];
 				b[count++]=a[i];
 			}
 		}
 		for(int i=0;i<count;i++)
 		System.out.println(b[i]+" ");
 	}
 }