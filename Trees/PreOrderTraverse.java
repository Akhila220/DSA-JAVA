public class PreOrderTraverse {
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[]args){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        preorder(root);
    }
}
