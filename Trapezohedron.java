import java.text.DecimalFormat;
  
  /**
 *Project 04.
 *@author Shadmaan Sabbir
 *@version Feb 10 2022
 */



public class Trapezohedron {


// Instance Variables
   private String label = "";
   private String color = "";
   private double shortEdge = 0;


/**
    * Prints course information to std output.
    * @param labelIn user inputs label
    * @param colorIn user inputs color
    * @param shortEdgeIn user inputs shortedge
    */
// Constructor
   public Trapezohedron(String labelIn, String colorIn, double shortEdgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setShortEdge(shortEdgeIn);
   }




// Methods

/**
    * Prints course information to std output.
    *@return returns age
    * 
    */

   public String getLabel() {
      return label;
   }
   
   /**
    * Prints course information to std output.
    *@return returns age
    * @param labelIn if not equals null then true
    */

   public boolean setLabel(String labelIn) 
   { 
      if (labelIn != null) { label = labelIn.trim(); 
         return true; } 
      else { 
         return false; }
   }
   
   /**
    * Prints course information to std output.
    *@return returns age
    * 
    */

   public String getColor() {
      return color;
   }
     /**
    * Prints course information to std output.
    *@return returns age
    * @param colorIn if not equals null then true
    */
   public boolean setColor(String colorIn) {
      if (colorIn != null) { color = colorIn.trim(); 
         return true; }
      else { 
         return false; }
   }
   
   /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   public double getShortEdge() {
      return shortEdge;
   }
   
     /**
    * Prints course information to std output.
    *@return returns age
    * @param shortEdgeIn if not equals null then true
    */
   public boolean setShortEdge(double shortEdgeIn) {
      if (shortEdgeIn > 0) { shortEdge = shortEdgeIn; 
         return true; }
      else { 
         return false; }
   }
    /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   
   public double edgeLengthAntiprism() {
      return shortEdge / ((Math.sqrt(5) - 1) / 2);
   }
   /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   
      
   public double longEdge() {
      return (((Math.sqrt(5) + 1) / 2) * edgeLengthAntiprism());
   }
      /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   public double surfaceArea() {
      return ((Math.sqrt((25 / 2.0) * (5 
         + (Math.sqrt(5))))) * ((Math.pow(edgeLengthAntiprism(), 2))));
   }
      /**
    * Prints course information to std output.
    *@return returns age
    * 
    */
   public double volume() {
      return (((5.0 / 12 * (3 + (Math.sqrt(5)))) 
         * (Math.pow(edgeLengthAntiprism(), 3))));
   }
   /**
    * Prints course information to std output.
    * @return return the output
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Trapezohedron " + "\"" + label + "\"" + " is " 
         + "\"" + color + "\"" + " with "
         + "20" + " edges and " 
         + "12" + " vertices. \n";
      output += "\tedge length antiprism = " + df.format(edgeLengthAntiprism()) 
         + " units" + "\n";
      output += "\tshort edge = " + df.format(shortEdge) + " units" + "\n";
      output += "\tlong edge = " + df.format(longEdge()) 
         + " units" + "\n";
      output += "\tsurface area = " + df.format(surfaceArea()) 
         + " square units" + "\n";
      output += "\tvolume = " + df.format(volume()) 
         + " cubic units " + "\n";
      return output;
   }
   
      
    
     


}