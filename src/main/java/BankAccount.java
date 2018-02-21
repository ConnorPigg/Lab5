import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
      Bank.totalAccounts++;
      this.accountType = accountCategory;
      this.ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public int getAccountNumber(){
      return this.accountNumber;
    }
    public double getBalance(){
      return this.accountBalance;
    }
    public String getName(){
      return this.ownerName;
    }
    public double getEarned(){
      return this.interestEarned;
    }
    public boolean setAccountNumber(final int i){
      this.accountNumber = i;return true;
    }
    public boolean setBalance(final double i){
      this.accountBalance= i;return true;
    }
    public boolean setName(final String i){
      this.ownerName= i;return true;
    }
    public boolean setEarned(final double i){
      this.interestEarned= i;return true;
    }
}
