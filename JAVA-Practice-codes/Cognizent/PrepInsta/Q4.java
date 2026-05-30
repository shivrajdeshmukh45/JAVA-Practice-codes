// Question-5
// Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets
// when there is a bulk booking of more than 20 tickets,
// and a discount of 2% on the total cost of tickets if a special coupon card is submitted. 
//Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 
//and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

// Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time.
// If fails display “Minimum of 5 and Maximum of 40 Tickets”. 
// If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

// The ticket cost should be printed exactly to two decimal places.

// Sample Input 1:

// Enter the no of ticket:35
// Do you want refreshment:y
// Do you have coupon code:y
// Enter the circle:k
// Sample Output 1:

// Ticket cost:4065.25
// Sample Input 2:

// Enter the no of ticket:1
// Sample Output 2:

// Minimum of 5 and Maximum of 40 Tickets

package Cognizent.PrepInsta;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get the number of tickets
        System.out.print("Enter the no of tickets: ");
        int numTickets = sc.nextInt();
        
        // Step 2: Validate the number of tickets
        if (numTickets < 5 || numTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        // Step 3: Ask for refreshment
        System.out.print("Do you want refreshment (y/n): ");
        char refreshmentOption = sc.next().charAt(0);

        // Step 4: Ask for coupon code
        System.out.print("Do you have a coupon code (y/n): ");
        char couponOption = sc.next().charAt(0);

        // Step 5: Ask for circle
        System.out.print("Enter the circle (k/q): ");
        char circle = sc.next().charAt(0);

        // Step 6: Determine the ticket price based on the circle
        double ticketPrice;
        if (circle == 'k') {
            ticketPrice = 75.0;
        } else if (circle == 'q') {
            ticketPrice = 150.0;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        // Step 7: Calculate the total ticket cost
        double totalCost = ticketPrice * numTickets;

        // Step 8: Apply a 10% discount if more than 20 tickets are booked
        if (numTickets > 20) {
            totalCost -= totalCost * 0.10;  // 10% discount
        }

        // Step 9: Apply a 2% discount if the user has a coupon code
        if (couponOption == 'y') {
            totalCost -= totalCost * 0.02;  // 2% discount
        }

        // Step 10: Add the refreshment cost if opted
        if (refreshmentOption == 'y') {
            totalCost += 50 * numTickets;  // Rs. 50 per ticket for refreshments
        }

        // Step 11: Print the final cost rounded to two decimal places
        System.out.printf("Ticket cost: %.2f%n", totalCost);
    }


}

    // public static void main(String[] args) {

    //     Scanner sc=new Scanner(System.in);

    //     //int totalCost=0;
    //     System.out.print("Enter the no of tickets :");
    //     int totalTicket=sc.nextInt();


    //     if(totalTicket<5 ||totalTicket>40){
    //         System.out.println("Minimum of 5 and Maximum of 40 Tickets");
    //         return;
    //     }
    //     System.out.print("Do you want refreshment (y/n): ");
    //     char refreshmentOption = sc.next().charAt(0);

    //     System.out.print("Do you have a coupon code (y/n): ");
    //         char coupon=sc.next().charAt(0);

    //         System.out.print("Enter the circle (k/q): ");
    //             char circle = sc.next().charAt(0);

    //             int ticketPrice=0;

    //             if (circle=='k') {
    //                 ticketPrice=75;
                    
    //             }else if (circle=='q') {
    //                 ticketPrice=150;
                    
    //             }else{
    //                 System.out.println("invalid input");
    //             }

                
    //      int totalCost= (totalTicket*ticketPrice);


    //       if (refreshmentOption=='y') {
    //         totalCost=totalCost*50;
            
    //       }
    //       if(coupon=='y'){
    //         totalCost-=totalCost*0.2;
    //       }
    //       if(totalTicket>20){
    //         totalCost-=totalCost*0.10;
    //       }
          


    //       System.out.println("Total Price :"+totalCost);

        
    
