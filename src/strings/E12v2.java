package strings;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-23.
 */
public class E12v2 extends Groups2 {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("(\\b[a-z]+\\b)");
        Pattern pattern = Pattern.compile("\\b((?![A-Z])\\w+)\\b");
        Matcher matcher = pattern.matcher(POEM);
        Collection<String> uniqueWords = new LinkedHashSet<>();
        while (matcher.find())
            uniqueWords.add(matcher.group());
        System.out.println(uniqueWords);
        System.out.println("Number of unique words = "+uniqueWords.size());
    }
}
