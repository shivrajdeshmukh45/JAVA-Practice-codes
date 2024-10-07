package Arrays.Array4;

public class Stringexp {

    public static void main(String[] args) {
        
        String s="abc";
        System.out.println(System.identityHashCode(s));

        String s1= new String("abc");
        System.out.println(System.identityHashCode(s1));
        
        StringBuffer s2= new StringBuffer("abc");
        System.out.println(System.identityHashCode(s2));

        StringBuilder s3= new StringBuilder("abc");
        System.out.println(System.identityHashCode(s3)); 

        
    }
    
}
