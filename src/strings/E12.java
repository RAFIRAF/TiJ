package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-16.
 */
public class E12 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Matcher m = Pattern.compile("\\b((?![A-Z])\\w+)\\b").matcher(Groups.POEM);
        while (m.find())
            words.add(m.group(1));
        System.out.println("Number of unique words = "+words.size());
        System.out.println(words);
    }
}
