class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinaryTreeHeight {
    public static int height(Node root){
        if(root==null) return 0;
        int lefth=height(root.left);
        int righth=height(root.right);
        return 1+Math.max(lefth,righth);
    }
    public static void main(String[]args){
        Node root=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n3.left=n4;
       System.out.println("The height of the binary tree is: "+height(root));
    }
    
}
