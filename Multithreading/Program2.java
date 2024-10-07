

//Setting thred name by using Constructor

public class Program2 extends Thread{
    Program2(String str){
        super(str);
    }


    public void run(){
        System.out.println("In Run");
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }

    }
    
    
}
class Client{
    public static void main(String[] args) {
        Program2 t1= new Program2("shiv");
        t1.start();
    }
}
