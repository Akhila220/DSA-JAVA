class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class InsertAtBeginning{
	public static Node insertfirst(Node head,int x){
		Node newNode=new Node(x);
		newNode.next=head;
		return newNode;
	}
	public static void printList(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.print(curr.data);
			if(curr.next!=null){
				System.out.print("-->");
			}
			curr=curr.next;
		}
	System.out.println();
	}
	public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
		int x = 1;
		head = insertfirst(head,x);
		printList(head);
	}
}