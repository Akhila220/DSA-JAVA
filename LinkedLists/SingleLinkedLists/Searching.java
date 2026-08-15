class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class Searching{
	public static void main(String[]args){
		int k=22;
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(23);
		head.next.next.next=new Node(30);
		Node temp=head;
		boolean flag=false;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			if(temp.data==k){
				flag=true;
			}
			temp=temp.next;
		}
		System.out.print("null"+"\n"+flag);
	}
}