class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.prev=null;
        this.next=null;
    }
}
 class InsertLast {
    public static Node last(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(23);
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String []args){
        Node head=new Node(10);
        Node sec=new Node(20);
        Node third=new Node(30);
        head.next=sec;
        sec.prev=head;
        sec.next=third;
        third.prev=sec;
        last(head);
        print(head);
    }
    
}
