public class RecursionLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public static void display(Node head){      ///RECURSIVE FUCTION

        if(head==null)return;

         System.out.print(head.data+" ");
           display(head.next);
            
        }

        public static void displayReverse(Node head){      ///RECURSIVE FUCTION

            if(head==null)return;


                displayReverse(head.next);
                System.out.print(head.data+" ");
               
                
            }


    
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(8);
        Node c=new Node(9);
        Node d=new Node(6);
        Node e=new Node(16);

        a.next=b;   //5->8
        b.next=c;   //5->8->9
        c.next=d;   //5 ->8 -> 9->6 
        d.next=e;   //5 ->8 -> 9->6 ->16

        // System.out.println(a.data);
        // System.out.println(a.next.data);//b
        // System.out.println(a.next.next.data);//c
        // System.out.println(a.next.next.next.data);//d
        // System.out.println(a.next.next.next.next.data);//e


        display(a);     //Here i send the Head Element  to the recursive function
        System.out.println();
        displayReverse(a);  //printing the list reverse 
    }
}

    

