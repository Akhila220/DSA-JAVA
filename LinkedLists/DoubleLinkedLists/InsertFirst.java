

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
 class InsertFirst {
    public static Node front(Node head){
        Node newNode=new Node(23);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        return newNode;
    }
    public static void travel(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
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
        head=front(head);
        travel(head);
    }
}
