class Node{
    int data;
    Node next=null;
    Node prev=null;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DeleteFirst {
    public static Node delete(Node head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            head=head.next;
            return head;
        }
        head.next.prev=null;
        head=head.next;
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
         head=delete(head);
        print(head);
    }
    
}
