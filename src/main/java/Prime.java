public class Prime {
    public static void main(String[] args) {
        int num = 29;
        System.out.println(num + " " + condition(num));
    }

    public static String condition(int num){
        
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        String result;
        if (!flag)
            result ="prime number";
        else
            result = "not a prime number";
        return result;
    }
}
