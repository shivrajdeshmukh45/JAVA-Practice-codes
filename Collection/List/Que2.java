package Collection.List;
import java.util.*;
public class Que2 {

    public static void main(String[] args) {
        
        Stack s= new Stack();
        s.push(10);  
        s.push("Shiv");
        s.push("Java");
        s.push(20);
        s.push(30);

        System.out.println(s);

        //pop()
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.peek());


        
    }
    
}
