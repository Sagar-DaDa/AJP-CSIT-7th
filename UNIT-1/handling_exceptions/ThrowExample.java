package handling_exceptions;

public class ThrowExample {
    // Method to validate age
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(19);  // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues...");
    }
}

