import java.util.ArrayList;

class Node{
    int data;
    ArrayList<Node>child;
    Node(int data){
        this.data=data;
        child=new ArrayList<>();
    }
}
class TreeImplem{
    public static void display(Node nodei){
        System.out.println(nodei.data);
        for(Node childii:nodei.child)
            {
            display(childii);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node n20=new Node(20);
        Node n30=new Node(30);
        Node n40=new Node(40);
        root.child.add(n20);
        root.child.add(n30);
        n20.child.add(n40);
        display(root);
    }
}
