class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class MinimumNode {
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
       int  leftmin=min(root.left);
       int rightmin=min(root.right);
      int minimum=Math.min(leftmin,rightmin);
        return Math.min(root.data,minimum);
    }
    public static void main(String[]args){
        Node root=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(5);
        Node n4=new Node(50);
        Node n5=new Node(60);
        Node n6=new Node(70);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n3.left=n5;
        n3.right=n6;
        System.out.println("The min value in tree is: "+min(root));
    }
}
