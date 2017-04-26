package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-24.
 */
public class ReFlags2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^java",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
        Matcher matcher = pattern.matcher("java has regex\nJava has regex\n" +
                "JAVA has pretty good regular expressions\n" +
                "Regular expressions are in Java");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
