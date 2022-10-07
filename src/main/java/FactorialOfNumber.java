public class FactorialOfNumber {
    public static void main(String[] args) {
        int number = 17;

        System.out.println(factorial_rec(number));
    }

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }

    public static long factorial_rec(int number) {

        if (number<=1){
            return 1;
        }else {
            return number * factorial_rec(--number);
        }
    }
}
