import java.util.*;

class Stack {
    int[] arr;
    int size;
    int top;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }
}

public class ArrayImplement {

    public static boolean isEmpty(Stack s) {
        if (s.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFull(Stack s) {
        if (s.top == s.arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void push(Stack s, int data) {
        if (isFull(s)) {
            System.out.println("Stack is Full. Cannot insert value.");
            return;
        }

        s.arr[++s.top] = data;
    }

    public static int pop(Stack s) {
        if (isEmpty(s)) {
            System.out.println("Stack is Empty.");
            return -1;
        }

        int x = s.arr[s.top];
        s.top--;

        return x;
    }

    public static int peek(Stack s) {
        if (isEmpty(s)) {
            System.out.println("Stack is Empty.");
            return -1;
        }

        return s.arr[s.top];
    }

    public static void print(Stack s) {
        System.out.println(Arrays.toString(s.arr));
    }

    public static void main(String[] args) {

        Stack s = new Stack(5);

        push(s, 5);
        push(s, 6);
        push(s, 7);

        System.out.println("Top element: " + peek(s));

        System.out.println("Popped element: " + pop(s));

        System.out.println("Top element: " + peek(s));

        print(s);
    }
}