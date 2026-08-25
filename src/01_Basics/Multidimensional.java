import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] myNumbers = { { 1, 4, 2 }, { 3, 6, 8, 5, 2 } };

        for (int[] row : myNumbers) {
            System.out.println(Arrays.toString(row));
            for (int num : row) {
                System.out.println(num);
            }
        }
    }

}
