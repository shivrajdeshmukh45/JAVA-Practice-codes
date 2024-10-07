//THREADPOOL example with start and end Discription



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo implements Runnable {
    int num=0;

        ThreadPoolDemo(int num){
            this.num=num;
        }
     public void run(){
        System.out.println(Thread.currentThread().getName()+"Start "+num);
        fun();
        System.out.println(Thread.currentThread().getName()+"End "+num);

     }

     void fun(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
     }
    
}

class Pool{
    public static void main(String[] args) {
        ExecutorService threadPool= Executors.newFixedThreadPool(5);
   
        for(int i=1;i<=10;i++){
            ThreadPoolDemo td= new ThreadPoolDemo(i);
            threadPool.execute(td);
    }
    }
}
