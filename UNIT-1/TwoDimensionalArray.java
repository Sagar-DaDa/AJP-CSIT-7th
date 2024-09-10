public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Example-1
        int[][] matrixDemo; //declaration
        matrixDemo = new int[3][3]; //instantiation
        matrixDemo[0][0] = 1; //initialization
        matrixDemo[0][1] = 2;
        matrixDemo[0][2] = 3;
        matrixDemo[1][0] = 4;
        matrixDemo[1][1] = 5;
        matrixDemo[1][2] = 6;
        matrixDemo[2][0] = 7;
        matrixDemo[2][1] = 8;
        matrixDemo[2][2] = 9;

        // Example-2: delcaration, instantiation and initialization
        String[][] cars = {
            {"Ford", "BMW", "Tesla"},
            {"Audi", "Mercedes", "Jaguar"},
            {"Honda", "Toyota", "Nissan"}
        };

        //Example-3
        int[][] nums = {
            {9, 8, 7},
            {6, 5, 4}
        };

        System.out.print(matrixDemo[0][0]);
        System.out.print(matrixDemo[0][1]);
        System.out.println(matrixDemo[0][2]);
        System.out.print(matrixDemo[1][0]);
        System.out.print(matrixDemo[1][1]);
        System.out.println(matrixDemo[1][2]);
        System.out.print(matrixDemo[2][0]);
        System.out.print(matrixDemo[2][1]);
        System.out.print(matrixDemo[2][2]);

        System.out.println("Car at 2nd row - 3rd column: " + cars[1][2]);

        System.out.println("Nums at 2nd row - 2nd column: " + nums[1][1]);
    }
}
