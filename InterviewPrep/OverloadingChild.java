
package InterviewPrep;
public class OverloadingChild {

   static void fun(){
        System.out.println("In Fun -Parent");
    }
    
    

  
     }
    class Child extends OverloadingChild{

        // static void fun(){
        //     System.out.println("In Fun -Child");
        // }
        

        public static void main(String[] args) {
            
            OverloadingChild obj=new OverloadingChild();
            obj.fun();


            Child obj1= new Child ();
            obj1.fun();



            OverloadingChild obj3= new Child ();
            obj3.fun();
        

    }
}
