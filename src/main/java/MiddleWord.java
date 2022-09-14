public class MiddleWord {
    public static void main(String[] args) {
        String string = "today is my best day";

        String[] bits = string.split(" ");
        String middleWord = bits[bits.length-3];
        System.out.println(middleWord);
    }
}

