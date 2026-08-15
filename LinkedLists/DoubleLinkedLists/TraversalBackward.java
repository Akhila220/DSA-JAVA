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
class TraversalBackward{
    public static void backward(Node tail){
        Node curr=tail;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.prev;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node sec=new Node(20);
        Node third=new Node(30);
        Node four=new Node(40);
        head.next=sec;
        sec.prev=head;
        sec.next=third;
        third.prev=sec;
        third.next=four;
        four.prev=third;
        backward(four);

    }
}