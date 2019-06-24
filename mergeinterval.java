import java.util.*;
import java.lang.*;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
  class mergeInterval{
  
 /*  static ArrayList<Interval> mergeInt(ArrayList<Interval> a){
       
  }*/
       public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Interval> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int st=in.nextInt();int en=in.nextInt();
            Interval t=new Interval(st,en);
            a.add(t);
        }
        ArrayList<Interval> ans=mergeInt(a);
        in.close();
    }
 }