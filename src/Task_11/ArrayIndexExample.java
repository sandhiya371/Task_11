package Task_11;

// QUS:5
// ArrayIndexOutOfBoundsException.

public class ArrayIndexExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            // Accessing an index that is out of bounds
            int result = numbers[9];
            System.out.println(result);  // This line won't be reached due to the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bound Exception.");
        }
    }
}

/*

OUTPUT:
Error: Array index out of bound Exception.

*/	