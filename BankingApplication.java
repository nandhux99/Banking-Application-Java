
import java.util.Scanner;

public class BankingApplication{

public static void main(String[] args) {
    
BankAccount bankaccount= new BankAccount("Kumarr", "90564A23");
bankaccount.showMenu();
}

}

class BankAccount{

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cusName, String cusId){
       customerName= cusName;
       customerId= cusId;
    }

    public void deposit(int amount){
if(amount !=0){
    balance= balance + amount;
    previousTransaction = previousTransaction+ amount;
    System.out.println("Deposited "+ amount);
}
    }
public void withdraw(int amount){
    if(amount!=0){
        balance = balance-amount;
        previousTransaction= previousTransaction- amount;
        System.out.println("Withdrawn "+ amount);
    }
}

public void getPreviousTransaction() {
     if(previousTransaction > 0){
        System.out.println("Deposited : "+ previousTransaction);
     }
     else if(previousTransaction < 0){
        System.out.println("Withdrawn : "+Math.abs(previousTransaction));
     }
     else{
        System.out.println("No Transaction Occured");
     }
}

public void showMenu(){

char options = '\0';


Scanner scanner = new Scanner(System.in);

System.out.println("Welcome "+ customerName);
System.out.println("Your id is "+ customerId);
System.out.println();
System.out.println("A. CheckBalance");
System.out.println("B. Deposit");
System.out.println("C. Withdraw");
System.out.println("D. PreviousTransaction");
System.out.println("E. Exit");


do{

System.out.println("=============================================");
System.out.println("Enter an Option");
System.out.println("=============================================");
options= scanner.next().charAt(0);
System.out.println();

switch (options) {
    case 'A':
    System.out.println("----------------------------------");
    System.out.println("Balance = "+balance);
    System.out.println("-----------------------------------");
    System.out.println();
        break;
    case 'B':
    System.out.println("-----------------------------------------");
    System.out.println("Enter an amount to deposit :");
    System.out.println("-----------------------------------------");
    int amount= scanner.nextInt();
    deposit(amount);
    System.out.println();
        break;
    
    case 'C':
    System.out.println("-----------------------------------------------");
    System.out.println("Enter an amount to withdraw : ");
    System.out.println("-----------------------------------------------");    
    int amount2= scanner.nextInt();
    withdraw(amount2);
    System.out.println();
    break;
    
    case 'D':
    System.out.println("------------------------------------------------");
    getPreviousTransaction();
    System.out.println("---------------------------------------------------");
    System.out.println();
    break;

    case 'E':
    System.out.println("----------------------------------------------------");
    break;

    default:
    System.out.println("Invalid option! Please Try again");
        break;
}

} while(options != 'E');
System.out.println("Thankyou for using our services");
scanner.close();
}
} 
