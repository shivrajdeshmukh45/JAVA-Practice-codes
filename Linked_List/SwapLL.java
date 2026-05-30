// Given a linked list, swap every two adjacent nodes and return its head.
//  You must solve the problem without modifying the values in the lists nodes 
//  (i.e., only nodes themselves may be changed.)
// Example 1:

// Input: head = [1,2,3,4]

// Output: [2,1,4,3]
// Example 2:

// Input: head = []

// Output: []

// Example 3:

// Input: head = [1]

// Output: [1]

// Example 4:

// Input: head = [1,2,3]

// Output: [2,1,3]

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class SwapLL {

    public static ListNode swapPairs(ListNode head) {
            
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
    
            while (prev.next != null && prev.next.next != null) {
                ListNode first = prev.next;
                ListNode second = prev.next.next;
    
                // Swap
                first.next = second.next;
                second.next = first;
                prev.next = second;
    
                // Move to the next pair
                prev = first;
            }
    
            return dummy.next;
        }
    
        static void printList(ListNode head){
            ListNode temp=head;
     
            while (temp!=null) {
    
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        public static void main(String[] args) {
            // Creating the linked list: 1 -> 2 -> 3 -> 4
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
    
            System.out.println("Original List:");
            printList(head);
    
            // Swapping pairs using iterative approach
            ListNode newHead = swapPairs(head);

        System.out.println("Swapped List:");
        printList(newHead);
    }
}