import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Prints a description of the course. 
 *
 *@author Shadmaan Sabbir
 *@version Feb 03 2022
 */
public class MathExpression {
 /**
   * Prints course information to std output.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      double result = (Math.sqrt(Math.abs(3 + (3 * x)
         + (3 * Math.pow(x, 2)) + (3 * Math.pow(x, 3))
         + (3 * Math.pow(x, 4)))) + 3 * Math.pow(x, 5))
         / (Math.abs(x) + 3);
   
      System.out.println("Result: " 
         + result);
      double y = result;
      String z = Double.toString(result);
      int p = z.indexOf(".");
      String l = z.substring(0, p);
      String r = z.substring(p + 1, z.length());
     
      
      
      System.out.println("# of characters to left of decimal point: " 
         + l.length());
      System.out.println("# of characters to right of decimal point: " 
         + r.length());
      DecimalFormat df = new DecimalFormat("#,##0.0##");
         
      System.out.println("Formatted Result: "
         + df.format(result));
      
         
         
   
   
   }

  
  
  
  
  
}
    
