class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

}
class DeletePosition{
    public static Node pos(Node head,int k){
        if(k==1){
            head=head.next;
            return head;
        }
        Node temp=head;
        for(int i=1;i<k-1&&temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            return head;
        }
        temp.next=temp.next.next;
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
        Node head=new Node(12);
        head.next=new Node(13);
        head.next.next=new Node(14);
        head.next.next.next=new Node(15);
        print(head);
        System.out.println();
        head=pos(head,k);
        print(head);
    }
}