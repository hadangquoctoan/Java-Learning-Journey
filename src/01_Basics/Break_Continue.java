public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i <10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i); //continue ignore i = 4 but still process until ending of loop
        }
    }
    
}
