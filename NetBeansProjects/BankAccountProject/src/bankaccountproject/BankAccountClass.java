/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountproject;

/**
 *
 * @author franciscocastrowetzstein
 */
public class BankAccountClass {
//**Create a class called Bank Account below that keeps track of the account holder’s name, the account number, and the balance in the account. 
//Make sure you use the appropriate data types for these.
//Write 2 constructors for the class that initialize the instance variables to default values and to given parameters. 
//For the parameters, use the same variable names as your instance variables. 
//Use the this keyword to distinguish between the instance variables and the parameter variables.
//* Write a toString() method for the class. Use the this keyword to return the instance variables.
//* Write a withdraw(amount) and deposit(amount) for the class. 
//Withdraw should subtract the amount from the balance as long as there is enough money in the account (the balance is larger than the amount). 
//Deposit should add the amount to the balance. Use the this keyword to refer to the balance.
//*/Test your class below with a main method that creates a Bank Account object and calls its deposit and withdraw methods and prints out the object to test its toString() method.   
    
private String name;
private int accountNumber;
private double accountBalance;
private int TotalBankAccounts;

public BankAccountClass (String initName, int initAccNumber, double initAccBalance){
    
    this.name = initName;
    this.accountNumber = initAccNumber;
    this.accountBalance = initAccBalance;
    this.TotalBankAccounts++; 
    
}

public BankAccountClass (String initName, int initAccNumber){
    this.name = initName;
    this.accountNumber = initAccNumber;
    this.accountBalance = 100000; 
    this.TotalBankAccounts++; 
}

public String toString(){
    return " Account Holder: " + name + " Account Number: " + accountNumber+ " Account Balance: $" + accountBalance;
}

public double setWithdraw(int ammount){
    if (accountBalance >= ammount)
        return accountBalance -= ammount;
    else
        System.out.println("Insufficient funds.");
        return 0;
}

public double setDeposit (int ammount){
    return accountBalance += ammount;
}



    
    
    
    
}
