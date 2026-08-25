public class Arrays {
    public static void main(String[] args) {
        // create array:
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // access elements:
        System.out.println(cars[0]);
        // change an array element:
        cars[0] = "Ope1";
        System.out.println(cars[0]);
        // array length:
        System.out.println(cars.length);
        // create array by using new keyword:
        String[] cars_v2 = new String[4]; // size is 4

        cars_v2[0] = "Volvo";
        cars_v2[1] = "BMW";
        cars_v2[2] = "Ford";
        cars_v2[3] = "Mazda";

        System.out.println(cars_v2[0]); // Outputs Volvo
        //calculate the sum of elements:
        int[] numbers = {1,5,10,25};
        int sum = 0;
        for (int i = 0; i< numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }

}
