package CSC1350_Spring24.Loops;

import java.util.Scanner;

public class PromptingUntilValidEntry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        double input;
        //just one way of donig this
        while (!valid){

            System.out.print("Please enter a positive value < 100: ");
            input = in.nextDouble();
            if (0 < input && input < 100) {
                valid = true;
            }
            else {
                System.out.println("Invalid input.");
            }
        }

    }
}
