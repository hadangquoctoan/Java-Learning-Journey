public class While_Loops {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x = x + 1;
        }
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");
        int i = 10;

        while (i < 5) {
            System.out.println("This will never be printed");
            i++;
        }
    }
}
