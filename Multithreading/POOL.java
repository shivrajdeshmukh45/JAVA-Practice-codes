//THREADPOOL example with start and end Discription



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class POOL implements Runnable {
    int num=0;

        POOL(int num){
            this.num=num;
        }
     public void run(){
        System.out.println(Thread.currentThread().getName()+"Start :"+num);
        fun();
        System.out.println(Thread.currentThread().getName()+"End  :"+num);

     }

     void fun(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
     }
    
}

class PoolExp2{
    public static void main(String[] args) {
       // ExecutorService threadPool= Executors.newFixedThreadPool(5);
        ThreadPoolExecutor threadPool=(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
        for(int i=1;i<=10;i++){
            POOL td= new POOL(i);
            threadPool.execute(td);
    }
    }
}
