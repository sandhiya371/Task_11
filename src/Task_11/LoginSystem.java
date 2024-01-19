package Task_11;

//QUS:6
import java.util.Scanner;

// Custom exception for incorrect password

public class LoginSystem {
	// Simulated correct password
	public static String CORRECT_PASSWORD = "Guvi@task11";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter your password: ");
			String enteredPassword = scanner.nextLine();

			// Check if entered password is correct
			if (!enteredPassword.equals(CORRECT_PASSWORD)) {
				throw new IncorrectPasswordException("Error: Incorrect password.");
			}

			System.out.println("Login successful!");

		} catch (IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
 * Out put:
 * 
 * For correct password: Enter your password: Guvi@task11 Login successful!
 * 
 * ------------------------------------------
 * 
 * For Wrong password: Enter your password: Secret@2587. Error: Incorrect
 * password.
 * 
 * 
 */
