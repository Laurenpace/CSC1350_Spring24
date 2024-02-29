package CSC1350_Spring24.SelectionStatements;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exp; //experience
        exp = in.nextInt();

        int bonus = switch (exp){
            case 1 -> 150;
            case 2 -> 167;
            case 3 -> 206;
            case 4 -> 300;
            default -> 670;

        };
        System.out.println(bonus);
        if(exp == 1)
            bonus = 150;
        else if(exp == 2)
            bonus = 167;
        else if(exp == 3)
            bonus = 206;
        else if(exp == 4)
            bonus = 300;
        else
            bonus = 670;
        System.out.println(bonus);
//        String var = switch (in.nextInt()) {
//            case 1 -> "one";
//            case 2 -> "two";
//            case 3 -> "three";
//            default -> "error";
//        };
//        System.out.println(var);
    }
}
