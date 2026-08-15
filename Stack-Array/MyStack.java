class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class MyStack{
    Node top;
    int count;
    MyStack(){
        top=null;
        count=0;
    }
    public  void push(int x){
        Node newNode =new Node(x);
        newNode.next=top;
        top=newNode;
        count++;
    }
    public  int pop(){
        if(top==null) return -1;
        int value=top.data;
        top=top.next;
        count--;
        return value;
    }
    public  int peek(){
        if(top==null) return -1;
        int value=top.data;
        return value;
    }
    public  void display(Node top){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[]args){
        MyStack s=new MyStack();
        s.push(3);
        s.push(4);
        s.push(6);
        s.push(7);
        s.display(s.top);
         System.out.println();
        System.out.println( "The popped element is: "+s.pop());
        System.out.println("The top element is: "+s.peek());
        System.out.println();
        s.display(s.top);
    }
}