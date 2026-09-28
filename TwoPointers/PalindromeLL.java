class ListNode{
    ListNode next;
    int data;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}




public class PalindromeLL {
    public  static boolean isPalindrome(ListNode head) {
        
        // 1. Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half
        ListNode prev = null;
        ListNode current = slow;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // 3. Compare first half and reversed second half
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;

    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(1);
        ListNode four=new ListNode(1);
        head.next=two;
        two.next=three;
        three.next=four;
        System.out.println("The given List is palindrome: "+isPalindrome(head));
    }
}
