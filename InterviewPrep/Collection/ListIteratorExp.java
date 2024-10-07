package InterviewPrep.Collection;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorExp {
    public static void main(String[] args) {
          Vector<Integer> v = new Vector<>(10);
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(50);
        v.addElement(60);
        v.addElement(70);

        
        ListIterator cursor=v.listIterator();

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
            
        }

        while (cursor.hasPrevious()) {
            System.out.println(cursor.next());
            
        }
    }

    
}
