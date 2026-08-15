class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class DeleteFirst{
    public static Node delete(Node head){
        if(head==null){
            System.out.println("Linked List is Empty");
            return null;
        }
        return head.next;   
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("-->");
            }
            temp=temp.next;
        }
    } 
    public static void main(String []args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        display(head);
        System.out.println();
       head= delete(head);
        display(head);
    }
}