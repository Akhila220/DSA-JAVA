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

public class BinaryTree {
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.data+"--> ");
        if(root.left!=null){
            System.out.print(root.left.data+ " ");
        }
        if(root.right!=null){
            System.out.print(root.right.data);
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        display(root);
    }
    
}
