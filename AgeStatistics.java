import java.util.Scanner;
/**
*Simple program to display someone name, age, gender.
*Activity 2
*@author Shadmaan Sabbir - COMP-1210-007
* @version Jan 24 2022
*/
public class AgeStatistics {
/**
   * Prints age in terms of minutes and centuries.
   * @param args Command line arguments - not used
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
    //Promp the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
    //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
   //convert age to minutes: 
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
                                                   
   //convert age to centuries
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
   //display max heart rate 
      System.out.print("Your max heart rate is "); 
      
      if (gender == 1) { 
      //calculate female MHR
         maxHeartRate = (209 - (0.7 * ageInYears));
      }
      else { // calculate male MHR 
         maxHeartRate = (214 - (0.8 * ageInYears)); }
      System.out.println(maxHeartRate + " beats per minute.");
   }
   
   


   

}