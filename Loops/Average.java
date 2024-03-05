package CSC1350_Spring24.Loops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int count = 0;
        while (in.hasNextDouble()){ //runs input until a non number value is given
            double input = in.nextDouble();
            total = total + input;
            count++;
        }
        double average = 0;
        if (count > 0) {
            average = total / count;
        }
        System.out.println("Average: " + average);
    }
}
