import java.util.*;
import java.lang.*;
class pair{
    char chr;
    int c;
    pair(char x,int y){chr=x;c=y;}
}
 class adjacentDiff{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char ch[]=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(hm.containsKey(ch[i])){
                int k=hm.get(ch[i]);
                hm.put(ch[i],k+1);
            }
            else
            hm.put(ch[i],1);
        }
        Iterator iter = hm.entrySet().iterator();  
        PriorityQueue<pair> pq=new PriorityQueue<pair>(new Comparator<pair>(){
            @Override
            public int compare(pair a,pair b){
                if(a.c!=b.c)
                return b.c-a.c;
                else
                return b.chr-a.chr;
            }
        });
        while (iter.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)iter.next(); 
            char temp=(char)mapElement.getKey();
            int temp1=(int)mapElement.getValue();
            pair t=new pair(temp,temp1);
            pq.add(t);
    }
    String ans=new String();
    pair prev=new pair('#',-1);
    while(!pq.isEmpty()){
        pair m=pq.poll();
        ans+=Character.toString(m.chr);
        m.c-=1;
        if(prev.c>0)
        pq.add(prev);
        prev=m;
    }
    if(s.length()!=ans.length())
    System.out.println("Nope");
    else
    System.out.println(ans);
} 
}