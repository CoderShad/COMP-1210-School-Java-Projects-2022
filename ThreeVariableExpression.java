import java.util.Scanner;
/**
*Simple program to find the result of a specified expression.
 *Project_02
*@author Shadmaan Sabbir - COMP-1210-007
* @version Jan 27 2022
*/
 
public class ThreeVariableExpression 
{ /**
   * Prints equation output for the input values.
   * @param args Command line arguments - not used
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      System.out.println("result = (3.5x - 7.75) " 
         + "(2.85y + 6.0) (1.5z - 3.1) / xyz");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      if (x *  y * z == 0) {
         System.out.println("result is \"undefined\"");
      }
      else { 
         System.out.println("result = " 
            + ((((3.5 * x) - 7.75) * ((2.85 * y) 
            + 6.0) * ((1.5 * z) - 3.1)) / (x * y * z)));
      }
   }
   
   
   
   
   
}