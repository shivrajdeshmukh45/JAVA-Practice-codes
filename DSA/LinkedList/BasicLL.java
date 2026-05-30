package LinkedList;

public class BasicLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
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

        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        
    }
    
}
