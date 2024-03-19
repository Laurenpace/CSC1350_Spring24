package CSC1350_Spring24.Loops;

import java.util.Scanner;

public class InputValidationUntilNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt()){
            in.nextLine();
            System.out.print("Enter a number: ");
        }
        int n = in.nextInt();
        System.out.println("you enter a number, " + n);
    }
}
