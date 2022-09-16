public class NrOfWords {

    public static void main(String[] args) {
        String s1 = "hello for this world and hello my love hello hello";
        String s2 = "hello";
        int numberof = 0;
        String[] bits = s1.split(" ");
        for (int i = 0; i < bits.length; i++) {
            if (bits[i].equals(s2)) {
                numberof += 1;
            } else {
                numberof += 0;
            }
        }
        System.out.println(numberof);
    }
}
