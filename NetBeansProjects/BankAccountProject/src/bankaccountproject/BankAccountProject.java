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
public class BankAccountProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String MrHiggins = bankAccounts("Mr.Higgins", 7456, 1000000.50);
        String MrsHiggins = bankAccounts2 ("Mrs.Higgins", 7455);
        System.out.println(MrHiggins);
        System.out.println(MrsHiggins);
        
    }
    
    public static String bankAccounts (String name, int accountNumber, double accountBalance){
       BankAccountClass accountHolder = new BankAccountClass (name, accountNumber, accountBalance);
       return accountHolder.toString();
        
    }
    
    public static String bankAccounts2 (String name, int accountNumber){
         BankAccountClass accountHolder = new BankAccountClass (name, accountNumber);
       return accountHolder.toString();
        
    }
    
}
