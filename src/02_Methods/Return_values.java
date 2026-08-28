public class Return_values {
    static int myMethod(int x) {
        return 5 + x;
    }
    static int myMethodv2(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethodv2(5, 6));
    }
    
}
    