import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;

/**
 *Project 05.
 *@author Shadmaan Sabbir
 *@version Feb 18 2022
 */



public class TrapezohedronList {

 /** 
 * Represents a list of triangles.
 */

//Instance Variable (Fields)

   private String listName;
   private ArrayList<Trapezohedron> trapObjs;
   
   
 /** 
    * Create a TriangleList object. 
    *
    * @param trapObjsIn for list
    * @param listNameIn for listname
    */  
  
//Constructor
   public TrapezohedronList(String listNameIn, 
      ArrayList<Trapezohedron> trapObjsIn) {
      listName = listNameIn;
      trapObjs = trapObjsIn;
   
   }
   
  /** Number is an integar.
    * @return the listName, user cab get 
    */

//Methods

   public String getName() {
      return listName;
   
   }

  /** Number is an integar.
    * @return the number of trapezohedrons
    */
   public int numberOfTrapezohedrons() {
      
      if (trapObjs.size() > 0) { 
         return (trapObjs.size()); } 
      else { 
         return 0; } 
      
   }
     
  /** Number is an integar.
    * @return the total surface area
    */
   public double totalSurfaceArea() {
   
      double total = 0;
      int index = 0;
      while (index < trapObjs.size()) {
         total += trapObjs.get(index).surfaceArea();
         index++;
      }   
      if (index > 0) {
         return total; }
      else { 
         return 0; }
   
   
   
   }
  /** Number is an integar.
    * @return the total volume
    */
   public double totalVolume() { 
   
      double total = 0;
      int index = 0;
      while (index < trapObjs.size()) {
         total += trapObjs.get(index).volume();
         index++;
      }   
      if (index > 0) {
         return total; }
      else { 
         return 0; }
   
   
   }
/** Number is an integar .
    * @return the average surface area
    */
   public double averageSurfaceArea() {
      
      int index = 0;
      double total = 0;
      while (index < trapObjs.size()) {
         total += trapObjs.get(index).surfaceArea();
         index++;
      }   
      double avgsurfaceArea = total / trapObjs.size();
      
      if (index > 0) {
         return avgsurfaceArea; }
      else { 
         return 0; }
   
   }
/** Number is an integar.
    * @return the average volume
    */
   public double averageVolume() {
      
      double total = 0;
      int index = 0;
      while (index < trapObjs.size()) {
         total += trapObjs.get(index).volume();
         index++;
      }   
      double avgvolume = total / trapObjs.size();
      if (index > 0) {
         return avgvolume; }
      else { 
         return 0; }
   }
/** Number is an integar.
    * @return String for list .
    * (includes name of list and the trapezohedrons)
    */
   public String toString() {
   
      int index = 0;
      String output = getName() + "\n";
      
      while (index < trapObjs.size()) {
         Trapezohedron data = trapObjs.get(index);
         output += "\n" + data.toString();
         index++;
      }
      return output;
   
   
   }
/** Number is an integar.
    * @return String for summary of the list 
    * (includes name of list and results for various method calls)
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
   
      String summary = "----- Summary for " + listName + " -----"
         + "\nNumber of Trapezohedrons: " + trapObjs.size() 
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())  
         + " square units"
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units" 
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units"
         + "\nAverage Volume: " + df.format(averageVolume()) + " cubic units";
   
   
      return summary;
   }
   
   /**
   * Print Arrya.
   *@return Trapezohedron list
   */
   public ArrayList<Trapezohedron> getList() {
      return trapObjs;
   }
   /**
   * Reads file.
   *@return spherocylinder list
   *@param fileNameIn used for file name
   *@throws FileNotFoundException - allows for file to be read
   */
   public TrapezohedronList readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String listname = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double shortEdge = Double.parseDouble(scanFile.nextLine());
      
         Trapezohedron s = new Trapezohedron(label, color, shortEdge);
         trapObjs.add(s);
      }
      scanFile.close();
      TrapezohedronList sL = new TrapezohedronList(listname, trapObjs);
      
      return sL;
   }
   /**
   * add Shape.
   *@param label - label of shape
   *@param color - Color of shape
   *@param shortEdge - shortEdge of shape
   */
   public void addTrapezohedron(String label, String color, double shortEdge) {
      Trapezohedron s = new Trapezohedron(label, color, shortEdge);
      trapObjs.add(s);
       
   }
   /**
   * find trap.
   *@param labelIn - label
   *@return the result
   */
   public Trapezohedron findTrapezohedron(String labelIn) {
      Trapezohedron result = null;
      for (Trapezohedron s : trapObjs) {
         if (s.getLabel().equalsIgnoreCase(labelIn)) {
            result = s;
         }
      }
      return result;
   }
 /**
 * delete trap.
   *@param labelIn - label
   *@return the result
   */
   public Trapezohedron deleteTrapezohedron(String labelIn) {
   
      Trapezohedron result = null;
      result = findTrapezohedron(labelIn);
      if (result != null) {
      
         trapObjs.remove(result);
      }
   
      return result;   
   }
/**
* edit trap.
   *@param labelIn - label of shape
   *@param colorIn - label of shape
   *@param shortEdgeIn - label of shape
   *@return the result
   */
   public boolean editTrapezohedron(String 
      labelIn, String colorIn, double shortEdgeIn) {
   
      Trapezohedron trapez = findTrapezohedron(labelIn);
      if (trapez != null) {
         trapez.setColor(colorIn);
         trapez.setShortEdge(shortEdgeIn);
         return true; }
      else { 
         return false; }
   }









}


