
public class MergeTwoLl {

   
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;
    
            if (list1.data < list2.data) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }



        
    
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null) {
            System.out.print(temp.data +" ");     //1-> 1-> 2-> 3-> 4-> 4 
            temp=temp.next;
            
        }

    }

    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;

        }
        ListNode(int data,ListNode next){
            this.data=data;
            this.next=next;



        }

        public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Creating second sorted linked list: 1 -> 3 -> 4

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Merging the lists
        MergeTwoLl merger =new  MergeTwoLl();
        ListNode mergedHead = merger.mergeTwoLists(list1, list2);
        display(mergedHead);



        



 
        }
    }
    
}
