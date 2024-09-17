// package handling_exceptions;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;  // This will throw ArithmeticException
        } catch (Exception exception) {
            System.out.println("Cannot divide by zero.");
            System.out.println("Cause: " + exception.getMessage());
        }
        System.out.println("After exception.");
    }
}

