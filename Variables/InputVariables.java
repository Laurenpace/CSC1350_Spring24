package CSC1350_Spring24.Variables;

import java.util.Scanner;

public class InputVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a double number: ");
        double num = in.nextDouble();
        System.out.println("You entered " + num);
    }
}
