package Cognizent;

public class Inheritance {
    int x=10;
    void function(){
        System.out.println("In fun Method");
    }
    
}


class Demo  extends Inheritance {
    public static void main(String[] args) {
        Demo obj= new Demo();
        System.out.println(obj.x);
        obj.function();

    }
 }
