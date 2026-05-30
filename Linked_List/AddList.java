// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
//  and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Example 1:

// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
// Example 2:

// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:

// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]
 
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddList {
    public ListNode AddList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        ListNode current = dummy; // Pointer to build the new list
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate new carry
            current.next = new ListNode(sum % 10); // Store only the last digit
            current = current.next; // Move forward
        }

        return dummy.next; // Return the sum list (skip dummy node)
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating first number: 342 (stored as 2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating second number: 465 (stored as 5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Adding two numbers
        AddList solution = new AddList();
        ListNode sumList = solution.AddList(l1, l2);  //we uses the inner class so we have to call like this

        // Printing the result
        printList(sumList);
    }
}

// l1 = [2,4,3] (342)
// l2 = [5,6,4] (465)


// 2 + 5 = 7 (carry = 0)
// 4 + 6 = 10 (store 0, carry = 1)
// 3 + 4 + 1 = 8 (carry = 0)
// [7,0,8]  (807)

