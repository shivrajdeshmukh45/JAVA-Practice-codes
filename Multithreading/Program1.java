/**
 * Program1
 */
public class Program1 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    
}

class Client{
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName());

        Program1 t1= new Program1();
        t1.setName("Shiv");
        t1.start();
    }
}