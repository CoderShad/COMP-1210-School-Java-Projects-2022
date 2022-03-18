import java.util.Scanner;
 
 
 /* *
 *Project 04.
 *
 *@author Shadmaan Sabbir
 *@version Feb 10 2022
 */


public class TrapezohedronApp {
/**
    * Prints course information to std output.
    *
    * @param args Command line arguments (not used).
    */
    
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String label1;
      String color1;
      double shortEdge1;
   
      System.out.println("Enter label, color,"
         + " and short edge length for a trapezohedron.");
      System.out.print("\tlabel: ");
      label1 = userInput.nextLine();
      System.out.print("\tcolor: ");
      color1 = userInput.nextLine();
      System.out.print("\tshort edge: ");
      shortEdge1 = userInput.nextDouble();
      
      
      if (shortEdge1 > 0) { 
         System.out.println();
         Trapezohedron object = new Trapezohedron(label1, color1, shortEdge1);
         object.setLabel(label1);
         object.setColor(color1);
         object.setShortEdge(shortEdge1);
         System.out.print(object);
      
      } 
      else { System.out.println("Error: short edge must be greater than zero.");
      }
   
   
   
   
   }
    
    
    
    
}