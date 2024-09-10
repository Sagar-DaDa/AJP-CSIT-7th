import java.util.Arrays;

public class ArrayEqualsExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};

        System.out.println("array1 equals array2: " + Arrays.equals(array1, array2));  // true
        System.out.println("array1 equals array3: " + Arrays.equals(array1, array3));  // false
    }
}
