import java.util.*;

public class DebugSeven2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        String line = input.nextLine();

        int sum = 0;
        String[] parts = line.split(" ");

        for (String p : parts) {
            int num = Integer.parseInt(p);
            System.out.println(" " + num);
            sum += num;
        }

        System.out.println("-------------------");
        System.out.println("The sum of the integers is " + sum);
    }
}
