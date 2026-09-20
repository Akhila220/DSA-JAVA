class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        right=null;
        left=null;
    }
}
public class IndorderTraversal {
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void main(String[]args){
        Node root=new Node(10);
        inorder(root);
    }
    

}
