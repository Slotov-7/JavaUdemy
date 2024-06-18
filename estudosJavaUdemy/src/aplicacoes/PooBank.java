package aplicacoes;

import ultil.Bank;

import java.util.Locale;
import java.util.Scanner;

public class PooBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        char yesOurNo;
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        yesOurNo = sc.nextLine().toLowerCase().charAt(0);
        if (yesOurNo == 'y'){
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(numberAccount, holderName, initialDeposit);
            System.out.println("Account data: \n" + bank);
        }
        else{
            bank = new Bank(numberAccount, holderName);
            System.out.println("Account data: \n" + bank);
        }

        System.out.print("Enter a deposit value: ");
        bank.addDeposit(sc.nextDouble());
        System.out.print("Update account data: \n" + bank);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        bank.withdraw(sc.nextDouble());
        System.out.println("Update account data: \n" + bank);
        sc.close();
    }
}
