package CSC1350_Spring24.Loops;

import java.util.Scanner;

//checks for immediate duplicate input
public class ComparingNeighboringValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long currentInput = in.nextLong();
        while (in.hasNextLong()) {
            long previousInput = currentInput;
            currentInput = in.nextLong();
            if (currentInput == previousInput) {
                System.out.println("Duplicate input");
            }
        }

    }
}
