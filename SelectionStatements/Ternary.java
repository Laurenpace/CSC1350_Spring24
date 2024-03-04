package CSC1350_Spring24.SelectionStatements;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String s = "";
        if(num == 5){
            s = "five";
        }
        else {
            s = "not five";
        }

        System.out.println(s);

        String s1 = (num == 5) ? "five" : "not five";

        System.out.println(s1);

    }
}
