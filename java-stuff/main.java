
import java.util.Scanner;
 
 
/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/
 
 
// ACCOUNT CLASS
 
class Account {
    // Instance variables (private for encapsulation)
   private String name;
   private double balance;
 
    // Constant: minimum balance

    private static final double MIN_balance = 0.0;

    /**
     * Constructor to initialize Account object
     * @param name Account holder's name
     * @param balance Initial balance (must be >= 0)
     */
    Account(String name, double balance){
        this.name = name;
        if (balance >= MIN_balance)
            this.balance = balance;
        else
            balance = MIN_balance;
    }
    
    
    
    // Set Methods (Mutators)
    void setName(String name) {
        this.name = name;
    }
    void setBalance(double balance){
        if(balance >= MIN_balance)
            this.balance = balance;
    }
    // Get Methods (Accessors)
    String getName(){
        return name;
    }

    double getBalance(){
        return balance;
    }
    // Display Info
    void displayInfo(){
        System.out.println("account name:" + name);
        System.out.println("balance: $" + balance);
    }
    // Method with parameter and return
        double deposit(double amount){
           if(amount > 0)
            balance += amount;
           return balance;
        }
  
 
  
 
// ABSTRACT CLASS EXAMPLE
 
abstract class AccountBase {
    // abstract method
    abstract double calculateInterest();
 //normal method
    void displayType(){
        System.out.println("this is a base account type");
    }

}
 
 
class SavingsAccount extends AccountBase {
    
    private double balance;
    private double rate;
    
    SavingsAccount(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }
    @Override
    double calculateInterest(){
        return balance * rate;
    }
}
 
 
// INTERFACE EXAMPLE
 
interface Printable {
    void print();
}
 
 
class AccountReport implements Printable {
    private Account account;
 
 
    AccountReport(Account account) {
        this.account = account;
    }
 
 
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}
 
 
// -------------------------
// MAIN CLASS
// -------------------------
public class Main {
    public static void main(String[] args) {
 
 
        System.out.println("==== Week 1: Account Class Demo ====");
 
 
       Scanner input = new Scanner(System.in);
        // 1. Creating Account Objects
        Account acc1 = new Account("val", 100);
        Account acc2 = new Account( "alice", 200);

        acc1.displayInfo();
        acc2.displayInfo();
        // 2. Using Set/Get Methods
        acc1.setName("valentina romar");
        System.out.println(acc1.getName());
        // 3. Primitive vs Reference Types
            Account acc3 = acc1;
            acc3.setBalance( 500);
        // 4. Constants
        System.out.println("balance costant: $" + 0.0);
        // 5. Methods with Parameters & Return Values
        double newBalance = acc2.deposit( 1000);
        System.out.println("acc2 new balance = $" + newBalance);
        // 6. Abstract Class
       SavingsAccount sa = new SavingsAccount(500,  0.05);
       sa.displayType();
        System.err.println("intrest for savings account = $" + sa.calculateInterest());
        // 7. Interface
        AccountReport report = new AccountReport(acc1)
        report.print();
        // 8. Scanner Example (Optional User Input)
       System.err.println("enter new for acc1 ");
       String newName = input.nextLine();
       acc2.setName(newName);
       acc2.displayInfo();
       input.close();
    }
}
 