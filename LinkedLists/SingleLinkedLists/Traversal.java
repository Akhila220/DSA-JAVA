class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class Traversal{
	public static void main(String []args){
	Node head=new Node(20);
	head.next=new Node(21);
	head.next.next=new Node(22);
	head.next.next.next=new Node(40);
	
	Node temp=head;
	while(temp!=null){
		System.out.print(temp.data+"-->");
		temp=temp.next;
	}
	System.out.println("null");
}
}