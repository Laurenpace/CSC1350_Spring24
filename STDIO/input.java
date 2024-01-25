package CSC1350_Spring24.STDIO;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        System.out.println(in.nextLine());
    }
}
