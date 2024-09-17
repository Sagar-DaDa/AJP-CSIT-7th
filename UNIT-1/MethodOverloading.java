public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(5, 3));         // Output: 8
        System.out.println(add(5, 3, 2));    // Output: 10
        System.out.println(add(5.5, 3.2));     // Output: 8.7
    }
    
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    static double add(double a, double b) {
        return a + b;
    }
}

