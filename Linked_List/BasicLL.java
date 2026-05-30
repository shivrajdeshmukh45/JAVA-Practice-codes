
public class BasicLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public static void display(Node head){
        Node temp=head;

        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }


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
        display(a);
        
    }
    
}
