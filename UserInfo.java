
/**
 *Activity 04.
 *
 *@author Shadmaan Sabbir
 *@version Feb 08 2022
 */

public class UserInfo {
/**
    * Prints course information to std output.
    * @param args Command line arguments (not used).
    * @param args Command line arguments (not used).
    */


// instance variables
   private String firstName; 
   private String lastName;
   private String location;
   private int age;
   private int status;

// constants
   private static final int OFFLINE = 0;
   private static final int ONLINE = 1;
   


// constructor
/**
    * Prints course information to std output.
    * @param firstNameIn user inputs name
    * @param lastNameIn user inputs name
    */

   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }

//methods
 /**
    * Prints course information to std output.
    * @return return the output
    */


   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else { 
         output += "Online";
      }
      return output;
      
      
   }
   /**
    * Prints course information to std output.
    * 
    */
      /**
    * Prints course information to std output.
    * @param locationIn takes input form user
    */
   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
      /**
    * Prints course information to std output.
    * @param ageIn takes input form user
    * @return returns the variable
    */
   
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
      
   }
      /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   public int getAge() {
      return age;
   }
      /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   public String getLocation() {
      return location;
   }
      /**
    * Prints course information to std output.
    *
    * 
    */
   public void logOff() {
      status = OFFLINE;
   }
      /**
    * Prints course information to std output.
    *
    * 
    */
   public void logOn() {
      status = ONLINE;
   }
   
   









}