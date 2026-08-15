class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class TraversalForward{
    public static void forward(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[]args){
        Node head=new Node(10);
        Node sec=new Node(20);
        Node third=new Node(30);
        head.next=sec;
        sec.prev=head;
        sec.next=third;
        third.prev=sec;
        forward(head);
    }
}