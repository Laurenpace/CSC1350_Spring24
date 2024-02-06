package CSC1350_Spring24.Variables;

import java.util.Scanner;

public class InputVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line of text: " );
        String str = in.nextLine();
        System.out.println("You entered " + str);

        System.out.print("Give me a double number: ");
        double num = in.nextDouble();
        System.out.println("You entered " + num);

        System.out.print("Give me an integer number: ");
        int numInt = in.nextInt();
        System.out.println("You entered " + numInt);


    }
}
