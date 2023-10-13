// Tufan Sahin Duzel - tufansahinduzel@ibu.edu.mk

import java.util.Scanner;

public class BankingApp {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        BankAccount bankAccounts[] = new BankAccount[10];
        int numAccounts = 0;

        int choice;

        do {
            choice = mainMenu(keyboard);
            System.out.println();

            if(choice == 1) {
                bankAccounts[numAccounts++] = openAccount(keyboard);
            } else if(choice == 2) {
                deposit(bankAccounts, numAccounts, keyboard);
            } else if(choice == 3) {
                withdrawal(bankAccounts, numAccounts, keyboard);
            } else if(choice == 4) {
                applyInt(bankAccounts, numAccounts, keyboard);
            } else {
                System.out.println("Exiting the application...");
            }
            System.out.println();
        } while(choice != 5);
    }
    public static int accMenu(Scanner keyboard) {
        System.out.println("Enter Account type: ");
        System.out.println("1- Checking Account");
        System.out.println("2- Savings Account");

        int choice;
        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        }while(choice < 1 || choice > 2);

        return choice;
    }

    public static int searchAcc(BankAccount bankAccounts[], int count, int accountNumber) {

        for(int i=0; i<count; i++) {
            if(bankAccounts[i].getAccno() == accountNumber) {
                return i;
            }
        }

        return -1;
    }

    public static void deposit(BankAccount bankAccounts[], int count, Scanner keyboard) {
        System.out.print("\nEnter Account No: ");
        int accountNumber = keyboard.nextInt();

        int index = searchAcc(bankAccounts, count, accountNumber);

        if(index >= 0) {
            System.out.print("\"Enter the amount you want to deposit: ");
            double amount = keyboard.nextDouble();

            bankAccounts[index].deposit(amount);
        } else {
            System.out.println("There is no account with this AccountNumber: " + accountNumber);
        }
    }

    public static void withdrawal(BankAccount bankAccounts[], int count, Scanner keyboard) {
        System.out.print("\nEnter Account No: ");
        int accountNumber = keyboard.nextInt();

        int index = searchAcc(bankAccounts, count, accountNumber);

        if(index >= 0) {
            System.out.print("Enter the amount you want to withdraw: ");
            double amount = keyboard.nextDouble();
            bankAccounts[index].withdraw(amount);
        } else {
            System.out.println("There is no account with this AccountNumber: " + accountNumber);
        }
    }

    public static void applyInt(BankAccount bankAccounts[], int count, Scanner keyboard) {
        System.out.print("\nEnter Account No: ");
        int accountNumber = keyboard.nextInt();

        int index = searchAcc(bankAccounts, count, accountNumber);

        if(index >= 0) {
            if(bankAccounts[index] instanceof SavingsBankAcc) {
                ((SavingsBankAcc) bankAccounts[index]).applyInt();
            }
        } else {
            System.out.println("There is no account with this AccountNumber: " + accountNumber);
        }
    }

    public static BankAccount openAccount(Scanner keyboard) {

        BankAccount bankAccount = null;
        int choice = accMenu(keyboard);

        int accountNumber;
        System.out.print("Enter Name: \n");
        System.out.print(" Enter Balance: \n");
        System.out.print(" Enter Account No: ");
        accountNumber = keyboard.nextInt();

        if(choice == 1)  { // chekcing account
            System.out.print("Enter Transaction Fee: ");
            double fee = keyboard.nextDouble();
            bankAccount = new BankDetails(accountNumber, fee);
        } else {

            System.out.print("Please enter Interest Rate: ");
            double ir = keyboard.nextDouble();
            bankAccount = new SavingsBankAcc(accountNumber, ir);
        }
        return bankAccount;
    }

    public static int mainMenu(Scanner keyboard) {
        System.out.println("Bank Account Menu");
        System.out.println("1- Create New Account");
        System.out.println("2- Deposit Funds");
        System.out.println("3- Withdraw Funds");
        System.out.println("4- Apply Interest");
        System.out.println("5- Quit");

        int choice;

        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        } while(choice < 1 || choice > 5);

        return choice;
    }
}