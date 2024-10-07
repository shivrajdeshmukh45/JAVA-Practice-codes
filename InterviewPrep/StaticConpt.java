
package InterviewPrep;
public class StaticConpt {

    static int x=10;
    static void fun(){
        System.out.println("In fun- parent");
    }


    
}
class Child extends StaticConpt{
    static int x=12 ;
    static void fun(){
        System.out.println("In fun- Child");
    }
}
class Client{
    public static void main(String[] args) {
        
        StaticConpt obj= new Child();
        System.out.println(obj.x);
        obj.fun();

    }
}