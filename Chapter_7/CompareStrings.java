import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name > ");
        String input = sc.nextLine();

        if (input.equals("Carmen")) {
            System.out.println("Carmen equals " + input);
        } else {
            System.out.println("Carmen does not equal " + input);
        }
    }
}
