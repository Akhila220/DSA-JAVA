
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            right=null;
            left=null;
        }
    }
    public static void levelOrder(Node root){
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current=queue.remove();
            System.out.print(current.data+" ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
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
        levelOrder(root);
    }
    


}
