package CSC1350_Spring24.Variables;

import java.util.Scanner;

public class printfExample {
    public static void main(String[] args) {
        int var = 1234;
        String str = "aasdfa";
        System.out.println("the int is " + var + " the string is " + str);
        System.out.printf("the int is %d the string is %s\n", var, str);

        System.out.printf("%8d%8s%8.1f\n", var, "Java", 5.63);
        System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 5.63);
        System.out.printf("%-8d%-8s%-8.1f\n", 1234555, "Python", 5.63);
        System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 5.63);
        double num = 4.333;
        System.out.println(num);
        System.out.printf("%.2f", num);






//
//        final double PI = 3.1415926;
//        System.out.printf("PI with two decimal points is $%.2f\n", PI);
//        System.out.println(PI);
//        int price = 50;
//        double tax = 0.055555;
//        System.out.printf("price: %d, tax: %.2f\n", price, tax);
//
//        String items = "Clams";
//        double price2 = 17.29;
//        System.out.printf("%-10s%10.2f\n", items + ":", price2);
//        System.out.printf("%-10d%10.2f\n", 5, 5);
//
//
//        System.out.println("Enter two numbers to subtract.");
//        Scanner in = new Scanner(System.in);
//        double num1 = in.nextDouble();
//        double num2 = in.nextDouble();
//        System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, num1 - num2);



    }
}
