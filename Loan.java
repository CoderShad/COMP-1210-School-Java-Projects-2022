public class Loan {

//instance variables

   private double balance = 0;
   private double interestRate = 0;
   private double maxLoanAmount;
   
   // constants
   private static final double DEFAULT_INTEREST = 0.05;
   private static final double CUSTOMER_MAX = 10000;
   private static final double EMPLOYEE_MAX = 100000;
   private static final int EMPLOYEE_ACCOUNT = 0;
   private static final int CUSTOMER_ACCOUNT = 1;
  
  // Constructors
   public Loan(int accountType) {
      interestRate = DEFAULT_INTEREST;
      if (accountType == EMPLOYEE_ACCOUNT) {
         maxLoanAmount = EMPLOYEE_MAX;
      }
      else {
         maxLoanAmount = CUSTOMER_MAX;
      }
   
   
   }
   
   // Methods
   public double getBalance() {
      return balance;
   }
   public boolean setInterestRate(double interestRateIn) {
      return false;
   }
   public boolean borrow(double amount) {
      return false;
   }
   public double calculateTotalBalance() {
      return 0;   }
   
   public String toString() {
      return ""; 
   }
   
   
   





}