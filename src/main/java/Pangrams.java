import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Pangrams {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
//        char[] charSearch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ' '};

        int amounth = 0;
        for (String search : str.replaceAll(" ", "").split("")) {
//            if (str.contains(String.valueOf(search))) {
            if (Pattern.matches("[a-zA-Z]", search)) {
                amounth++;
            }
        }
        System.out.println(amounth == str.replaceAll(" ", "").length());
        Learn learn = new Learn();
        System.out.println(Stream.of(str.replaceAll(" ", "").split("")).filter(i -> Pattern.matches("[a-zA-Z]", i)).count() == str.replaceAll(" ", "").length());
    }


}

