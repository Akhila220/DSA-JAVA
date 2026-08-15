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
 class InsertPosition {
    public static Node position(Node head,int pos,int d){
        if(pos<1){
            return head;
        }
        if(pos==1){
            Node newNode=new Node(d);
            newNode.next=head;
            head.prev=newNode;
            return newNode;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            return head;
        }
        Node newNode=new Node(d);
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
        head=position(head,1, 23);
        print(head);

    }
    
}
