package Task_11;

// QUS:4
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Check if the second number is zero
            if (num2 == 0) {
                throw new ArithmeticException("Error: Division by zero is not allowed.");
            }

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*

Output:

Enter the first integer: 25
Enter the second integer: 0
Error: Division by zero is not allowed.


*/
