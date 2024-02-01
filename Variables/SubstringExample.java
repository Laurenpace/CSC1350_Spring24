package CSC1350_Spring24.Variables;

import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
//        String str = "sometext";
//        String hi2 = str.substring(4, 8); //.substring(inclusive, exclusive)
//
//        String hi = "sometext".substring(4, 8); //.substring(inclusive, exclusive)
        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
        String hi2 = in.nextLine().substring(4, 8); //.substring(inclusive, exclusive)

//        System.out.println(str);
        System.out.println(hi2);
    }
}
