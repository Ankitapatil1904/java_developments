package exception;
import java.util.Scanner;

public class Throwclause {
    public static void main(String[] args) {
        try {
            arithmeticOp();
        } catch (Exception ex) {
            System.out.println("The exception is: " + ex);
        }
    }

    static void arithmeticOp() {
        System.out.println("Enter the two numbers:");
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];

        
        a[0] = Integer.parseInt(scanner.nextLine());
        a[1] = Integer.parseInt(scanner.nextLine());

        
        if (a[0] == 0) {
            throw new ArithmeticException("Division by zero is not possible.");
        }

        
        a[2] = a[1] / a[0];
        System.out.println("Division result is: " + a[2]);
        
        scanner.close(); 
    }
}
