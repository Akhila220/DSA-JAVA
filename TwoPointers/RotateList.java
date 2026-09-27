class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class RotateList{
    public static Node rotate(Node head,int k){
        Node temp=head;
        Node pointer;
        while(k>=1){
            temp=head;
         while(temp.next.next!=null){
            temp=temp.next;
         }

         pointer=temp.next;
         temp.next=null;
         pointer.next=head;
         head=pointer;
         k--;
       
        }
        return head;
    }
    public static void traversal(Node head){
        Node node=head;
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        int k=2;
       head= rotate(head, k);
        traversal(head);


    }
}