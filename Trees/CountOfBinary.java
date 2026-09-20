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
public class CountOfBinary {
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
      int  leftCount=countNodes(root.left);
      int rightCount=countNodes(root.right);
      return 1+leftCount+rightCount;
    }
    public static void main(String[] args) {
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
        n2.left=n5;
        System.out.println("The no.of nodes in tree is: "+countNodes(root));
    }
    
}
