public class FactorialOfNumber {
    public static void main(String[] args) {
        int number = 6;

        System.out.println(factorial(number));
    }

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }
}
