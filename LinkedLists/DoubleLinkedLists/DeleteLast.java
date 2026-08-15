class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DeleteLast {
    public static Node delete(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main (String []args){
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
