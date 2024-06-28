package aplicacoes;

import entites.Account;
import entites.BusinessAccount;
import entites.SavingsAccount;

public class TestAccount {
    public static void main(String[] args) {

        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);
        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "joel", 0.0, 1000.0);
        Account acc3 = new SavingsAccount(1004, "jose", 0.0, 1000.0);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;

    //BusinessAccount acc5 = (BusinessAccount) acc3; //erro que o compilador não sabe
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3 ;
            acc5.updateBalance();
            System.out.println("update");
        }
    }
}
