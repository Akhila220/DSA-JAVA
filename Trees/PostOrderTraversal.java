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
public class PostOrderTraversal {
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root=new Node(10);
         root.left=new Node(20);
         root.right=new Node(30);
        root.left.left=new Node(40);
        postorder(root);
    }
}
