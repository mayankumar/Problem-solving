import java.util.*;
import java.lang.*;

class node{
    int data;
    node left,right;
    node(int x){
        data=x;
        left=null;right=null;
    }
}

class tree{
    static node root=null;
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n;
    do{
        System.out.println("\n1. Insert \n2. Inorder \n3. Level Order \n4. PreOrder \n5. PostOrder \n6. Exist");
        n=in.nextInt();
    }
    in.close();
    }
}