package site.nosaj.oop.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter owner: ");
        String owner = scanner.nextLine();
        System.out.println("Enter balance: ");
        double balance = Double.parseDouble(scanner.nextLine());
        BankAccount account = new BankAccount(owner, balance);
        System.out.println(account);
        System.out.println("Do you want to withdraw/deposit(w/d): ");
        String choice = scanner.nextLine();
        switch (choice){
            case "w":
                System.out.println("Enter amount: ");
                double withdrawAmount = Double.parseDouble(scanner.nextLine());
                if(withdrawAmount < 0) {
                    System.out.println("Invalid amount. Program will exit.");
                    break;
                }
                System.out.println(account.withdraw(withdrawAmount));
                break;
            case "d":
                System.out.println("Enter amount: ");
                double depositAmount = Double.parseDouble(scanner.nextLine());
                if(depositAmount < 0) {
                    System.out.println("Invalid amount. Program will exit.");
                    break;
                }
                System.out.println(account.deposit(depositAmount));
                break;
            default:
                System.out.println("Invalid choice. Program will exit.");
        }
        scanner.close();


    }
}
