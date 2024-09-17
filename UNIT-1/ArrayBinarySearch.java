import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 1, 8, 4, 9};
        Arrays.sort(numbers);  // The array must be sorted before binary search
        int index = Arrays.binarySearch(numbers, 5);
        
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found. Insertion point: " + -(index + 1));
        }
    }
}
