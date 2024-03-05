package CSC1350_Spring24.Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3 ; j++) {
                System.out.printf("%-4d" , i*j );
            }
            System.out.println();
        }
    }
}
