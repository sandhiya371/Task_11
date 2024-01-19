package Task_11;
//QUS:5  StringIndexOutOfBoundsException

public class StringIndexExample {
    public static void main(String[] args) {
        try {
            String text = "GUVI TASK11";
            // Accessing an index that is out of bounds for the string
            char result = text.charAt(15);
            System.out.println(result);  // This line won't be reached due to the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index out of bound Exception.");
        }
    }
}

/*

Error: String index out of bound Exception.

*/