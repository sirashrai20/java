public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4]; 
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
