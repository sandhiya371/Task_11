package Task_11;
//QUS:7

import java.util.Scanner;

// Custom exception for invalid age

public class AgeValidationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if age is less than 18
            if (age < 18) {
                throw new InvalidAgeException("Error: Age must be 18 or older.");
            }

            System.out.println("Age validation successful!");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
OUTPUT:

For valid credential:

Enter your age: 22
Age validation successful!

--------------------------------------------
For Invalid credential:

Enter your age: 15
Error: Age must be 18 or older.

 
 */