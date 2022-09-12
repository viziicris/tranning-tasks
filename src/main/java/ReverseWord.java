import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWord {
    @Test
    public void testReverseWord() {
        Assert.assertEquals(reverseWord("Hello World!"), "!dlroW olleH");
    }

    public static String reverseWord(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }
}

