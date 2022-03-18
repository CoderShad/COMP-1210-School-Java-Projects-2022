/**
 * This program contains all the methods
 * used to find the Bank Loan.
 *
 * Activity 07A.
 * @author : Shadmaan Sabbir.
 * @version : 3/16/22.
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
/**
   * Constructor method that takes in the label, radius,
   * and height of the spherocylinder.
   * @param customerNameIn takes the name of the customer
   * @param interestRateIn takes double value for radius
   * 
  */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
    /**
   * Returns the String label. 
   * @param amount returns a string
      @return boolean returns boolean
  */
   // static methods
   public static boolean isAmountValid(double amount) {
      return ((amount >= 0) ? true : false);
   
   }
    /**
   * Returns the String label. 
   * @param loan takes loan amount
      @return boolean returns boolean
  */
   public static boolean isInDebt(BankLoan loan)
   {
      if (loan.getBalance() > 0) { 
         return true; }
      return false;
   }
    /**
   * Returns the String label. 
   
      @return boolean returns boolean
  */
   public static int getLoansCreated() {
      return loansCreated;
   }
     /**
   * Returns the String label. 
  
      
  */  
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
/** Returns the String label. 
   * @param amount takes loan amount
      @return boolean returns boolean
  */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/** Returns the String label. 
   * @param amountPaid takes loan amount
      @return boolean returns boolean
  */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /** Returns the String label. 
  
      @return boolean returns boolean
  */
   public double getBalance() {
      return balance;
   }
   /** Returns the String label. 
   * @param interestRateIn takes loan amount
      @return boolean returns boolean
  */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /** Returns the String label. 
   * @return amount takes loan amount
 
  */
   public double getInterestRate() {
      return interestRate;
   }
   /** Returns the String label. 
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /** Returns the String label. 
         @return boolean returns boolean
  */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
