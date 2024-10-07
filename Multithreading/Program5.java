
//code by using Annanymous Inner class
//There is no need to Write classnand implements it.. we can directly,
//But Use INNer class Concept when for Single Use only..Otherwise use Lambda function

// public class Program5 implements Runnable{
//         public void run(){
//             System.out.println(Thread.currentThread().getName());
//             System.out.println("In Run method");
//         }    
// }


class ThreadInner{
    public static void main(String[] args) {
        
    Runnable ref= new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
                System.out.println("In Run method");
    }    
};   
    Thread t1= new Thread(ref);
    t1.start();     

        
    }
}
