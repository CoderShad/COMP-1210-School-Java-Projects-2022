
 /**
 *Activity 05.
 *
 *@author Shadmaan Sabbir
 *@version Feb 15 2022
 */


public class NumberOperations {
//instance variables
   private int number;


/**
    * Prints course information to std output.
    * @param numberIn user inputs label
    */
//constructor
   public NumberOperations(int numberIn) {
      number = numberIn;
   
   
   }
   
   /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
//methods
   public int getValue() {
      return number; }
    /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         } i++; } 
      return output; }
      /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
   
      while (powers < number) { 
          
         output += powers + "\t";
         powers = powers * 2;  
      }
      return output; }
      /**
    * Prints course information to std output.
    *@return returns int
    * @param compareNumber user inputs int
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) { 
         return 1; }
      else if (number < compareNumber) { 
         return -1; }
      else { 
         return 0; }
   
   }
   /**
    * Prints course information to std output.
    *@return returns String
    * 
    */
   public String toString() {
      
      return number + ""; }

}