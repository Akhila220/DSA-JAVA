class Queue{
    int[]arr;
    int size; 
    int front;
    int rear;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
}
class QueueArray{
  
   public boolean isFull(Queue q) {
    return q.rear == q.size - 1;
}
public boolean isEmpty(Queue q){
    return q.front==-1||q.front > q.rear;
}
   public  void push(Queue q,int x){
        if(isFull(q)){
            System.out.println("The queue is full cannot insert");
        }
        if(q.front==-1) q.front=0;
        q.arr[++q.rear]=x;
   }
   public  int pop(Queue q){
        if(isEmpty(q)){ 
            System.out.println("Queue is Empty");
            return -1;
        }
       if(q.front==-1) q.front=0;
       int x=q.arr[q.front];
       q.front++;
       return x;
   }
   public   int peek (Queue q){
        if(isEmpty(q)){
            return -1;
        }
        return q.arr[++q.front];
   }
   public  int len(Queue q){
        if(isEmpty(q)) return 0;
        int count=(q.rear-q.front)+1;
        return count;
   }
   public void display(Queue q){
        for(int i=q.front;i<=q.rear;i++){
            System.out.print(q.arr[i]+" ");
        }
   }
   public static void main(String[]args){
        Queue q=new Queue(5);
        Queue b=new Queue(5);
        QueueArray obj=new QueueArray();
        obj.push(q,4);  
        obj.push(q,3);
        obj.push(q,5);
        obj.push(b,4);
        obj.push(b,3);
        obj.push(b,5);
        obj.display(q);
        obj.display(b);
        System.out.println( obj.pop(q) );
        obj.display(q); 
        System.out.println("Size is of b is: "+ obj.len(q));   
   }
}