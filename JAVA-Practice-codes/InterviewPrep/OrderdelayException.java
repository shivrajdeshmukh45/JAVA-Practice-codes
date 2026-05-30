package InterviewPrep;

public class OrderdelayException extends RuntimeException {
    OrderdelayException(String str){
        super(str);
    }
    
}

class Zomato{
    boolean rainStatus=false;

    boolean checkRainStatus(){
        if(rainStatus==true){
            return rainStatus;
        }else{
            return rainStatus;
        }
    }

    void order(String ord){

        boolean val=checkRainStatus();
        if(val==true){
         
                throw new OrderdelayException("Order delayed due to heavy rain");
            
                
            }else{
            System.out.println("Your order "+ord+ " prepaering ");
            }
        }

     
    }

    class User{
        public static void main(String[] args) {
            
            Zomato obj=new Zomato();
            

            try {
                obj.order("Biryani");
            } catch (OrderdelayException e) {
                System.out.println(e.getMessage());
            }
        }
    }

