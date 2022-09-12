public class SumOfDigits {
    public static void main(String[] args) {
        int number1 = 22;
        int sum=0;
        String stringnumber = Integer.toString(number1);
        for (int i = 0; i < stringnumber.length(); i++) {
            sum=sum+(stringnumber.charAt(i)-48);
        }
        System.out.println(sum);
    }
}
