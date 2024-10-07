package InterviewPrep.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationExp {

    public static void main(String[] args) {
        
        
        Vector<Integer> v = new Vector<>(10);
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(50);
        v.addElement(60);
        v.addElement(70);

        // Print out the elements of the Vector
       System.out.println(v);

       Enumeration<Integer> cursor=v.elements();

       while (cursor.hasMoreElements()) {
            System.out.println(cursor.nextElement());
        
       }
    }
}
