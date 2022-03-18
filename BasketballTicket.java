import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * Prints a description of the course. 
 *
 *@author Shadmaan Sabbir
 *@version Feb 03 2022
 */
public class BasketballTicket {
 /**
   * Prints course information to std output.
   *
   * @param args Command line arguments (not used).
   */
   
   public static void main(String[] args) { 
   
      Scanner userInput = new Scanner(System.in);
      String ticketCode = "";
      String time = "";
      String dateFormat = "";
      String section = "";
      String row = "";
      String seat = "";
      String ticket = "";
      
      Random randomprize = new Random();
      
      
      
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine();
      ticketCode = ticketCode.trim();
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat dff = new DecimalFormat("0%");
      DecimalFormat dfff = new DecimalFormat("$#,###.00");
      DecimalFormat df3 = new DecimalFormat("000000");
      
      System.out.println("");
      
      
      if (ticketCode.length() >= 28) {
         dateFormat = ticketCode.substring(12, 14) 
            + "/" + ticketCode.substring(14, 16) 
            + "/" + ticketCode.substring(16, 20);
         time = ticketCode.substring(8, 10) 
            + ":" + ticketCode.substring(10, 12);
         section = ticketCode.substring(20, 23);
         row = ticketCode.substring(23, 25);
         seat = ticketCode.substring(25, 27);
         double price = Double.parseDouble(ticketCode.substring(0, 4));
         double discount = ((Double.parseDouble(ticketCode.substring(6, 8))) /
            + 100);
         ticket = ticketCode.substring(27, ticketCode.length());
         
         System.out.println("Ticket: " + ticket);
         System.out.println("Date: " + dateFormat   
            + "   Time: " + time);
         System.out.println("Section: " + section
            + "   Row: " + row  
            + "   Seat: " + seat);
            
         System.out.println("Price: " + df.format(price) 
            + "   Discount: " + dff.format(discount)
            + "   Cost: " + dfff.format((price - (price * discount))));
         System.out.println("Prize Number: " + randomprize.nextInt(1000000));
            
      }
      
      else { //invalid output
      
         System.out.println("*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 28 characters.");
      }
      
      
      
      
   
   
   
   } 
}