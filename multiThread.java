import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    String name;
    MyThread(String x){name=x;start();}
    public void run(){
        System.out.println("Thread Started"+" "+this.name);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){}
        System.out.println("Thread Finished"+" "+this.name);
    }
}
 class multiThread{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /*Thread t=Thread.currentThread();
        System.out.println(t+" "+t.getPriority());
        t.setName("Mayank's Thread");t.setPriority(7);
        System.out.println(t + " " + t.getPriority());*/
        MyThread my=new MyThread("One");
        MyThread my1 = new MyThread("Two");
        MyThread my2 = new MyThread("Three");
        in.close();
    }
} 