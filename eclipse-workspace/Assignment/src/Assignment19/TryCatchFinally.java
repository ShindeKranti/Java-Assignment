package Assignment19;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Exception caught");

        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
