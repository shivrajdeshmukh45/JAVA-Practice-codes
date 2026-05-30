package Collection.List;
import java.util.*;
public class Que1 {

    public static void main(String[] args) {
        
      

        ///
        ArrayList<Integer> al2=new ArrayList<Integer>();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        System.out.println(al2);


        ArrayList<Integer> al=new ArrayList<Integer>(al2);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        //indexOf(ele)

        System.out.println(al.indexOf(40));

        //addAll(al1)

        //remove
       // al.remove(4);
        System.out.println(al);


        //removeAll(Collection<?>c)

        al.removeAll(al2);
        System.out.println(al);
    }
    
}
