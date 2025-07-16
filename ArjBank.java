package Bank;

import java.util.Scanner;

public class ArjBank {
    int pin;
    double balance;
    String name;
    Scanner fin = new Scanner(System.in);
    ArjBank(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
    void withdraw() {
        System.out.println("Enter pin: ");
        int enteredPin = fin.nextInt();
        if (enteredPin == pin) {
            System.out.println("Pin is Correct");
                System.out.println("Enter Amount of money to withdraw: ");
                int withdrawing = fin.nextInt();
                if (withdrawing <= this.balance) {
                    if (withdrawing > 0) {
                        this.balance -= withdrawing;
                        System.out.println("Withdrawed: " + withdrawing);
                        System.out.println("Old Balance: " + (this.balance + withdrawing));
                        System.out.println("New Balance: " + this.balance);
                    } else {
                        System.out.println("Withdrawal is negative.");
                    }
                } else {
                        System.out.println("Withdrawal is higher than balance.");
                }
        }  else {
            System.out.println("Incorrect pin");
        }
    }

    void viewInformation() {
        
        System.out.println("Enter pin: ");
        int enteredPin = fin.nextInt();
        if (enteredPin == pin) {
            System.out.println("Pin is Correct");
            System.out.println("Account name: " + name);
            System.out.println("Account balance: " + this.balance);
        } else {
            System.out.println("Incorrect pin");
        }
    }

    void deposit() {
        System.out.println("Enter pin: ");
        int enteredPin = fin.nextInt();
        if (enteredPin == pin) {
            System.out.println("Enter Amount of money to deposit: ");
            int depositing = fin.nextInt();
            while (true) {
                if (depositing <= 0) {
                    System.out.println("Only positive values can be deposited");
                        System.out.println("Enter Amount of money to deposit: ");
                        depositing = fin.nextInt();
                } else {
                    this.balance += depositing;
                    break;
                }
            }
        }
    }

}


