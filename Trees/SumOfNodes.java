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
public class SumOfNodes {
    public static int sumNode(Node root){
        if(root==null) return 0;
       return root.data+sumNode(root.left)+sumNode(root.right);
    }
    public static void main(String[]args){
        Node root=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        Node n5=new Node(60);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n3.left=n5;
        System.out.println("The sum of the nodes is: "+sumNode(root));
    }
}
