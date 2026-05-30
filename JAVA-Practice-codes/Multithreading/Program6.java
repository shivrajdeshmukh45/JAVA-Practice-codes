public class Program6 {
    public static void main(String[] args) {
        Runnable ref= ()-> {                ///IMP
            System.out.println("In Run method");
            
        };

        Thread t1= new Thread(ref);
        t1.start();
    }
    
    
}
