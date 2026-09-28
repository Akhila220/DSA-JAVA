/*
   --- As LinkedList Cannot be traversed in both directions so the brute force we are using another array/arraylist and we are doing 
   we can do it in  better sapace rather than this i.e; optimal approach !!!

*/
import java.util.ArrayList;
class Node{
  Node next;
  int data; 
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
public class LLPalindrome {
  public static boolean palindrome(Node head){
    ArrayList<Integer>list=new ArrayList<>();
    Node temp=head;
    while(temp!=null){
      list.add(temp.data);
      temp=temp.next;
    }
    boolean flag=true;
    int i=0;
    int j=list.size()-1;
    while(i<=j){
        if(list.get(i)!=list.get(j)){
            flag=false;
        }
        i++;
        j--;
    }
    return flag;
  }
  public static void main(String[] args) {
      Node head=new Node(10);
      Node two=new Node(10);
      Node three=new Node(10);
      Node four=new Node(10);
      head.next=two;
      two.next=three;
      three.next=four;
      System.out.println("The given is palindrome: "+palindrome(head));
  }
}
