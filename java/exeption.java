public class exeption {
    public static void main(String[] args) {
        int d,a;
        try {
            d = 1;
            a = 42 / d;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
}