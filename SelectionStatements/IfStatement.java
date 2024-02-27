package CSC1350_Spring24.SelectionStatements;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        if (num > 10){
            System.out.println("You entered a number greater than 10.");
            num++;
        }
        else if (num < 10){
            System.out.println("You entered a number less than 10.");
        }
        else {
            System.out.println("You entered 10");
        }


//
//        ///////////
        System.out.print("Enter a 5: ");
        if (in.nextInt() == 5)
            System.out.println("Good job, you entered a 5");
        else System.out.println("Try again");
//
//
        int var1 = 1, var2 =2;
        if(var1*var2 !=  10){
            //woo math
        }
//        /////


    }
}
