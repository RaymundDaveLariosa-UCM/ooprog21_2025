import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance, interestRate = 0.03;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        do {
            System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            if (choice == 1) {
                balance = balance + (balance * interestRate);
                System.out.printf("After year 1 at %.2f interest rate, balance is $%.1f%n", interestRate, balance);
            }
        } while (choice == 1);

        input.close();
    }
}
