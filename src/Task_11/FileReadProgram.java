package Task_11;
//QUS:8

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadProgram {
    public static void main(String[] args) {
        try {
            // Provide the file path or replace it with the actual file path
            File file = new File("C:\\Users\\Sandhiya\\eclipse-workspace\\JAVA_Task11\\src\\Task_11\\file.txt");

            // Check if the file exists
            if (!file.exists()) {
                throw new FileNotFoundException("Error: File not found.");
            }

            // Read data from the file (this is a placeholder, replace it with your actual file reading logic)
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*

OUTPUT:
Error: File not found.

*/