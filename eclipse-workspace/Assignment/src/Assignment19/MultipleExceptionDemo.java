package Assignment19;

public class MultipleExceptionDemo {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};
            int result = arr[5];     // ArrayIndexOutOfBounds
            int value = 10 / 0;      // ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred");
        }
    }
}
