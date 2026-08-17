class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueueLinked{
    Node front;
    Node rear;
    int size;
    QueueLinked(){
        front=rear=null;
    }
    public boolean  isEmpty(){
        return front==null;
    }
    public void enqueue(int x){
        Node newNode =new Node(x);
        if(isEmpty()) {
            front=newNode;
            rear=newNode;
        };
        rear.next=newNode;
        rear=newNode;
        size++;
    }
    public int dequeue(){
        if(isEmpty()) { 
            return -1;
        }
        int d=front.data;
        front=front.next;
        if(front==null) rear=null;
        size--;
        return d;
    }
    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" " );
            temp=temp.next;
        }
    }
    public static void main(String[]args){
       QueueLinked queue1=new QueueLinked();
        queue1.enqueue(45);
        queue1.enqueue(40);
        queue1.enqueue(35);
        queue1.enqueue(30);
        queue1.display();
        System.out.println(queue1.dequeue());
        queue1.display();

    }
}