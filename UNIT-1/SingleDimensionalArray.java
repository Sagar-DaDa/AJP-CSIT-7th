public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Example-1
        String[] cars; //declaratin
        cars = new String[5]; //instantiation
        cars[0] = "Ford"; //initialization
        cars[1] = "BMW";
        cars[2] = "Tesla";
        cars[3] = "MG";
        cars[4] = "Lamborghini";

        //Example-2
        int nums[] = new int[7]; //delcaration and instantiation
        nums[0] = 2; //initialization
        nums[1] = 7;
        nums[2] = 1;
        nums[3] = 9;
        nums[4] = 4;
        nums[5] = 6;
        nums[6] = 5;

        //Example-3: delcaration, instantiation and initialization
        String[] students = {"Drona", "Pratik", "Govind"};
        String[] countries = new String[]{"Nepal", "China", "India", "Russia"};
        int []exNums = {2, 7, 5, 4, 6};

        System.out.println(cars[2]);
        System.out.println(nums[5]);
        System.out.println(students[1]);
        System.out.println(countries[3]);
        System.out.println(exNums[2]);

    }
}
