import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


   /**
   *Project 05.
   *@author Shadmaan Sabbir
   *@version Feb 18 2022
   */


public class TrapezohedronListApp {
/**
 * Reads file with trapezzohedron data, 
 * creates TrapezohderonList, prints TapezohedrponList,
 * prints summary of TriangleList.
 *
 * @param args - is not used.
      * @throws FileNotFoundException required by Scanner for File
 */

   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<Trapezohedron> appTrapObj = new ArrayList<Trapezohedron>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = Double.parseDouble(scanFile.nextLine());
         Trapezohedron t = new Trapezohedron(label, color, edge);
         appTrapObj.add(t);
      }
      scanFile.close();
      TrapezohedronList trapz = new TrapezohedronList(listName, appTrapObj);
      System.out.println(trapz.toString() + "\n");
      System.out.println("\n" + trapz.summaryInfo());
      
   }
}