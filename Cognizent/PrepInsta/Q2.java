// Question-2
// Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

// Rs.100/pizza
// Rs.20/puffs
// Rs.10/cooldrink
// Generate a bill for What Vohra has bought.

// Sample Input 1:

// Enter the no of pizzas bought:10
// Enter the no of puffs bought:12
// Enter the no of cool drinks bought:5
// Sample Output 1:

// Bill Details

// No of pizzas:10
// No of puffs:12
// No of cooldrinks:5
// Total price=1290

package Cognizent.PrepInsta;

public class Q2 {

    static int totalBill(int pizaa,int puffs,int drink,int pizaaPrice,int puffsPrice,int drinkPrice){
        
        int totalAmount=(pizaa*pizaaPrice)+(puffs*puffsPrice)+(drink*drinkPrice);
        System.out.println(totalAmount);
        return totalAmount;
    }
    public static void main(String[] args) {
        int pizaaPrice=100;
        int puffsPrice=20;
        int drinkPrice=10;


        int pizaa=10;
        int puffs=12;
        int drink=5;

       totalBill(pizaa, puffs, drink, pizaaPrice, puffsPrice, drinkPrice);

    }
    
}
