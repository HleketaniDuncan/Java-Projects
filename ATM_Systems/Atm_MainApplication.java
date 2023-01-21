package ATM_Systems;

import java.util.Scanner;

public class Atm_MainApplication {

Atm_MainApplication atmObj = new Atm_MainApplication();    
private double amount,balance,depositedAmount,withdrawnAmount,transferedAmount;
private int option;
private Scanner scannerObj = new Scanner(System.in);


public Atm_MainApplication(){
    
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}

public double getDepositedAmount() {
    return depositedAmount;
}

public void setDepositedAmount(double depositedAmount) {
    this.depositedAmount = depositedAmount;
}

public static void main(String[] args) {
    
Atm_MainApplication atmObj = new Atm_MainApplication();
int option = atmObj.option;
Scanner scanner = atmObj.scannerObj;

System.out.println("Welcome to ATM Application");
System.out.println();
System.out.println("Please Select an option:\n \n1.Card Banking \n2.Cardless Banking\n3.Exit");
option = scanner.nextInt();


switch(option){

    case 1:
    
                    atmObj.atm_CardServices();
                   break ;

    case 2:
                    break;
                     
    case 3: 
                    break;



} 


}

public void atm_Menu(){

}

public void atm_CardServices(){

    System.out.println("Please insert pin");

    System.out.println("Pin Ok");
    atmObj.atm_Accounts();
  
   // System.out.println("Incorrect Pin");

}

public void atm_Accounts(){

    System.out.println("Please Select Account:\n \n1.Savings\n2.Fixed");
    option = scannerObj.nextInt();

    switch (option) {
        case 1:
            atm_SavingsAccount();
            
            break;

        case 2:
            break;
    
        default:
            break;
    }


}

public void atm_SavingsAccount(){

    System.out.println("1.View Balance\n2.Deposit Money\n3.Withdraw Money\n4.");

    option = scannerObj.nextInt();

    switch (option) {
        case 1:
            getBalance();
            
            break;

        case 2:

             

            break;
    
        default:
            break;
    }


}
}


















