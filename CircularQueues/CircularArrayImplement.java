class Queue {
    int[]arr;
    int capacity;
    int front;
    int rear;
    int size;
    Queue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        front=0;
        rear=0;
        size=0;
    }
    public boolean  isEmpty(){
       return size==0;

    }
    public boolean isFull(){
        return size==capacity;
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Full!!");
            return;
        }
        arr[rear]=x;
        rear=(rear+1)%capacity;
        size++;
        //reseting the rear values only within the 0 and cap-1;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Empty!!");
        }
        int x=arr[front];
        front=(front+1)%capacity;
        size--;
        return x;
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("Empty!!");
        }
        int x=arr[front];
        return x;
    }
    public int getRear(){
        if(isEmpty()){
            System.out.println("Empty!!");
        }
        int index=(rear-1+capacity)%capacity;
        return arr[index];
    }

}
public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        for (int i = 0; i < size; i++) {

            int index = (front + i) % capacity;

            System.out.print(arr[index] + " ");
        }

        System.out.println();
    }
class CircularArrayImplement{
    public static void main(String[]args){
        Queue q=new Queue(5);
        q.enqueue(34);
        q.enqueue(32);
    }
}