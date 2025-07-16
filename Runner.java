package Bank;

import java.util.Scanner;

public class Runner {
        public static void main(String[] args) {
        ArjBank account = new ArjBank("Arjun", 123456, 345);
        @SuppressWarnings("resource")
        Scanner fin = new Scanner(System.in);

        while (true) {
            System.out.println("1) Quit\r\n" + //
                        "2) View Account Information\r\n" + //
                        "3) Deposity Money\r\n" + //
                        "4) Withdraw Money");
            int action = fin.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Thank you for using ArjBank!");
                    System.exit(0);
                    break;

                case 2:
                    account.viewInformation();
                    break;

                case 3:
                    account.deposit();
                    break;

                case 4:
                    account.withdraw();
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
