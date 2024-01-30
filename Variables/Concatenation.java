package CSC1350_Spring24.Variables;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("num = " + num);
        String someString1 = "hi";
        String someString2 = "string";
        String stringConcat = someString1 + someString2;
        System.out.println("result of concatenating and printing " + stringConcat);
        System.out.println("someString1 is unchanged: " + someString1);
        System.out.println("someString2 is unchanged: " + someString2);
        System.out.println("concat in print statement " + someString1 + someString2);
        System.out.println("formatting strings cleanly with spacing: " + someString1 + " " + someString2);
        Scanner in = new Scanner(System.in);
        String test = in.nextLine();
        System.out.println("text: " + num + test);
    }
}
