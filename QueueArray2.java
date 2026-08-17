class Queue{
    int[]arr;
    int capacity;
    int size;
    Queue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull(){
        return size==capacity;
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("The queue is Full Cannot insert!!");
        }
        arr[size]=x;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is Empty cannot delete!!");
        }
        int x=arr[0];
        for(int i=1;i<=size;i++){
            arr[i-1]=arr[i];
        }
        size--;
        return x;
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class QueueArray2{
    public static void main(String[] args) {
        Queue q=new Queue(6);
        q.enqueue(32);
        q.enqueue(34);
        q.enqueue(36);
        q.enqueue(38);
        q.display();
        System.err.println();
        q.dequeue();
        q.display();
    }
}