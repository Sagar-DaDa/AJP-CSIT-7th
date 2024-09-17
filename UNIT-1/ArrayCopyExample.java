public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];

        // Copy 3 elements from source starting at index 1 to destination starting at index 0
        System.arraycopy(source, 1, destination, 0, 3);

        // Printing the destination array after copying
        for (int num : destination) {
            System.out.println(num + " ");  // Output: 2 3 4 0 0
        }
    }
}