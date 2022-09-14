public class MiddleWord {
    public static void main(String[] args) {
        String string = "today is my best day because I met u";

        String[] bits = string.split(" ");
        int nr = bits.length/2+1;
        String middleWord = bits[bits.length-nr];
        System.out.println(middleWord);
    }
}

