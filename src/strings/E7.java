package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-21.
 */
public class E7 {
    public static void main(String[] args) {
        Pattern beginWithACapitalEndWithAPeriod = Pattern.compile("\\p{javaUpperCase}.*\\.");
        Matcher matcher = beginWithACapitalEndWithAPeriod.matcher("Hello world.");
        Matcher matcher1 = beginWithACapitalEndWithAPeriod.matcher("hello.world.");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }
}
