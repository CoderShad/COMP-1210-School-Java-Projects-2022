import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** 
 * TrapezohedronListApp - uses TrapezohedronList and Trapezohedron classes.
 */

public class TrapezohedronListMenuApp { 
   /**
 * Reads file with Trapezohedron data, 
  creates TrapezohedronList, prints TrapezohedronList,
 * prints summary of TriangleList.
 *
 * @param args - is not used.
      * @throws FileNotFoundException required by Scanner for File
 */
   public static void main(String[] args) throws FileNotFoundException {
   
      Scanner userInput = new Scanner(System.in);
      String trapListName = "*** no list name assigned ***";
      ArrayList<Trapezohedron> myList = new ArrayList<Trapezohedron>(); 
      TrapezohedronList trapObjs = new TrapezohedronList(trapListName, myList);
      String fileName = "no file name";
      
      String label;
      String color;
      double shortEdge;
      String code = "";
      
      System.out.println("Trapezohedron List System Menu"
         + "\nR - Read File and Create Trapezohedron List" 
         + "\nP - Print Trapezohedron List"
         + "\nS - Print Summary"
         + "\nA - Add Trapezohedron"
         + "\nD - Delete Trapezohedron" 
         + "\nF - Find Trapezohedron" 
         + "\nE - Edit Trapezohedron" 
         + "\nQ - Quit");
            
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = userInput.nextLine();
         if (code.length() == 0) {
            continue;
         }  
         code = code.toUpperCase();
         char choice = code.charAt(0);
         switch (choice) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = userInput.nextLine().trim();
               trapObjs.readFile(fileName);
               System.out.println("\tFile read in and "
                              + "Trapezohedron List created\n");
               break;
         
            case 'P':
               System.out.println(trapObjs.toString());
               break;
         
            case'S':
               System.out.println(trapObjs.summaryInfo());
               break;
         
            case 'A':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tColor: ");
               color = userInput.nextLine();
               System.out.print("\tShort Edge: ");
               shortEdge = Double.parseDouble(userInput.nextLine());
            
               trapObjs.addTrapezohedron(label, color, shortEdge);
               System.out.println("\t*** Trapezohedron added ***\n");
               break;
         
            case 'D':
             
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               Trapezohedron c = trapObjs.findTrapezohedron(label);
               if (c != null) {
                  trapObjs.deleteTrapezohedron(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
                
               break;
         
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine().trim();
               Trapezohedron c1 = trapObjs.findTrapezohedron(label);
               if (c1 != null) {
                  System.out.print("" + c1 + "\n\n");
               }
               else {
                  System.out.print("\t\"" + label + "\" not found\n\n");
               }
               break;
         
            case 'E':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               Trapezohedron c2 = trapObjs.findTrapezohedron(label);
              
               if (c2 != null) {
                  System.out.print("\tColor: ");
                  color = userInput.nextLine();
                  System.out.print("\tShort Edge: ");
                  shortEdge = Double.parseDouble(userInput.nextLine());
                  System.out.print("\t\"" + label 
                     + "\" successfully edited\n\n");
                  trapObjs.editTrapezohedron(label, color, shortEdge);
               
               }  
               else {
                  System.out.print("\tColor: ");
                  color = userInput.nextLine();
                  System.out.print("\tShort Edge: ");
                  shortEdge = Double.parseDouble(userInput.nextLine());
                  System.out.print("\t\"" + label + "\" not found\n\n");  
               }
               break;
         
            case 'Q':
               break;
         
            default:
               System.out.print("\t*** invalid code ***\n\n");
         
         
         
         }
         
         
      } while (!code.equalsIgnoreCase("Q")); 
      
      
   } 
   
}
           

