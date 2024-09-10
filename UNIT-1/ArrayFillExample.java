import java.util.Arrays;

public class ArrayFillExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 7);  // Fill all elements with the value 7

        System.out.println("Filled array: " + Arrays.toString(numbers));  // [7, 7, 7, 7, 7]
    }
}
