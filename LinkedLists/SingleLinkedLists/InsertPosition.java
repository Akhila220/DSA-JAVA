class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class InsertPosition{
    public static Node pos(Node head,int k,int value){
        Node temp=head;
        if(k==1){
            Node newNode =new Node(value);
            newNode.next=head;
            return newNode;
        }
        for(int i=1;i<k-1&&temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            return head;
        }
        Node newNode =new Node(value);
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static void print(Node head){
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
        int k=1;
        int value=23;
        Node head=new Node(19);
        head.next=new Node(23);
        head.next.next=new Node(19);
        head.next.next.next=new Node(23);
        print(head);
        System.out.println();
       head= pos(head,k,value);
        print(head);
    }
}