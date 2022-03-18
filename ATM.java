import java.util.Scanner;
/**
*Simple program to find the result of a specified expression.
*Project_02
*@author Shadmaan Sabbir - COMP-1210-007
* @version Jan 27 2022
*/
 
public class ATM 
{ /**
   * Prints equation output for the input values.
   * @param args Command line arguments - not used
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int dollarAmount = 0;
      System.out.print("Enter the amount: ");
      dollarAmount = userInput.nextInt();
      if (dollarAmount > 500) {
         System.out.print("Limit of $500 exceeded!");
      }
      else {
         System.out.println("Bills by denomination: ");
         System.out.println("\t$20: " + (dollarAmount) / 20);
         System.out.println("\t$10: " + (dollarAmount % 20) / 10);         
         System.out.println("\t$5: " + (dollarAmount % 10) / 5);
         System.out.println("\t$1: " + (dollarAmount % 5) / 1);
         System.out.println("$" + dollarAmount + " = (" 
            + ((dollarAmount) / 20) + " * $20) +"
            + " (" + ((dollarAmount % 20) / 10) + " * $10) +"
            + " (" + ((dollarAmount % 10) / 5) + " * $5) +"
            + " (" + ((dollarAmount % 5) / 1) + " * $1) ");
      }
   }  
}