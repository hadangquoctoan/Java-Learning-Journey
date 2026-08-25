public class For_Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {  //statement 1 -> execute one time; statement 2 -> define condition; statement 3
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);

        for (int i = 1; i <=2; i++) {
            System.out.println("Outer: " + i);
            
            for (int j = 1; j<=3; j++) {
                System.out.println("Inner: " +j);
        }

    }
}
}