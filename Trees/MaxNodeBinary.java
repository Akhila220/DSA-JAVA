class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class MaxNodeBinary {
    public static int maxi(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int leftmax=maxi(root.left);
        int rightmax=maxi(root.right);
        int maximum=  Math.max(leftmax,rightmax);
        return Math.max(root.data,maximum);
    }
     
    public static void main(String[]args){
        Node root=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        Node n5=new  Node(45);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n3.right=n5;
        System.out.println("The maximum value present in the tree is: "+maxi(root));
    }
}
