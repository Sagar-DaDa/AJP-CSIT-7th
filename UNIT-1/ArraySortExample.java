import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        String[] names = {"Pratik", "Drona", "Govind", "Puja"};
        Arrays.sort(names);  // Sort array in natural order (alphabetical for strings)

        System.out.println("Sorted array: " + Arrays.toString(names));  // [Alice, Bob, John, Zoe]
    }
}