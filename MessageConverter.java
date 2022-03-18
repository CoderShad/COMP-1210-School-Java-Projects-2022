import java.util.Scanner;
 /**
 * Prints a description of the course. 
 *
 *@author Shadmaan Sabbir
 *@version Feb 01 2022
 */
public class MessageConverter {

/**
    * Prints course information to std output.
    *
    * @param args Command line arguments (not used).
    */
    
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String message = "";
      String result = "";
      int outputType = 0;
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0) { // as is
         result = message;
      }
      else if (outputType == 1) { // trimmed 
         result = message.trim();
      }
      else if (outputType == 2) { // lower case 
         result = message.toLowerCase();
      }
      else if (outputType == 3) { // upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) { // replace vowels
         result = message.replace("a", "_");
         result = result.replace("e", "_");
         result = result.replace("i", "_");
         result = result.replace("o", "_");
         result = result.replace("u", "_");
      }
      else if (outputType == 5) { // without first and last character
         result = message.substring(1, message.length()-1);
      }
      else { // invalid input 
         result = "Error: Invalid choice input";
      }
      
      System.out.println("\n" + result);
      
      
      
      
      
      
      
   }
   
}
