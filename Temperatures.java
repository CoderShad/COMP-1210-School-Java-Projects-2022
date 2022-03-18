import java.util.ArrayList;
/** 
 * TemperatureInfo - uses Temperatures classes.
 */

public class Temperatures {

//Instance Variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
 /** 
    * Create a TriangleList object. 
    *
    * @param temperaturesIn creates arraylist
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   
   }
   /** getlowtemp.
    * @return the list name
    */
   public int getLowTemp() {
   
      if (temperatures.isEmpty()) { 
         return 0; }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) { low = temperatures.get(i); } }
      return low; } 
   /** get high temp.
    * @return the list name
    */
   public int getHighTemp() {
   
      if (temperatures.isEmpty()) { 
         return 0; }
      int high = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) > high) { high = temperatures.get(i); } }
      return high; 
   }
   /** lowerminimum.
    * @return the list name
    * @param lowIn parameter
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
  /** higher minimum.
    * @param highIn paramter
    * @return the list name
    */
   public int higherMaximum(int highIn) {
   
      return highIn > getHighTemp() ? highIn : getHighTemp();
   
   }
   /** 
    * print string.
    * @return String for list. 
    * (includes name of list and the triangles)
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   
      
   }
  
  
  
   


}