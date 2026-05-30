package InterviewPrep;


public class ThisDemo {

    ThisDemo(){
        this(10);
        System.out.println("in No Paramete");
    }
    ThisDemo(int x){
        this(20, 30);
        System.out.println(x);
    }
    ThisDemo(int y,int z){
        System.out.println(y);
        System.out.println(z);

    }
    
}
class Child extends ThisDemo{

    Child(){
        System.out.println(this);
    }


    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj);
    }
}
