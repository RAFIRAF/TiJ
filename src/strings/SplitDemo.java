package strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-17.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
    }
}
