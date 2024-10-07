
//code bye using Runnable interface
//by using Runnable interface we can use multiple interface
//Runnable interface is Functional interface as it has only one mehod that is run() method

class Parent{
    void gun(){
        System.out.println("In GUN method");
    }
}

class FuncClass extends Parent {
    void fun(){
        System.out.println("In fun method");
    }
}
public class Program4 extends FuncClass implements Runnable {
    public void run(){
        System.out.println("In Run Method");
        fun();
        gun();

    }
    
}
class ThreadIF{
    public static void main(String[] args) {
        Program4 pt= new Program4();
        Thread t1= new Thread(pt);
        t1.start();
    }
}
