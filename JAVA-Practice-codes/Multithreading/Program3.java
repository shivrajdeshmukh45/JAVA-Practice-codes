
// code by using the join method

public class Program3 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("In run");
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }   
}
class ThreadDemo{
    public static void main(String[] args)throws Exception{
        
        Program3 t1= new Program3();
        t1.start();
        

        

        for(int i=1;i<=5;i++){
            System.out.println("In Main");
            t1.join();
      }
    


    }
}
