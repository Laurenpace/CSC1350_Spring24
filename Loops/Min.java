package CSC1350_Spring24.Loops;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double smallest = in.nextDouble();
        while (in.hasNextDouble()){
            double input = in.nextDouble();
            if (input < smallest){
                smallest = input;
            }
        }
        System.out.println(smallest);

    }
}
