import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/** Fixture initialization (common initialization
    *  for all tests). **/
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
 /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", 0.10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), 0.00001);
   }
}