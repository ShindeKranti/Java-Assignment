package Assignment20;

public class NestedTryDemo {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};

            try {
                int result = arr[5];   // ArrayIndexOutOfBoundsException
                System.out.println(result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound");
            }

            int a = 10 / 0;   // ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("!!!!");
    }
}