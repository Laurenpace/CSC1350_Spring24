package CSC1350_Spring24.Methods;

public class MultiplyTwoNums {
    public static void main(String[] args) {
        System.out.println(multiplyTwoNums(3,4));
        int num = 4;
        System.out.println(multiplyTwoNums(num, 4));
    }

    public static int multiplyTwoNums(int num1, int num2){
        return num1 * num2;
    }

    public static double multiplyTwoNums(double num1, double num2){
        return num1 * num2;
    }

    public static int alternateMultiplyTwoNums(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
}
