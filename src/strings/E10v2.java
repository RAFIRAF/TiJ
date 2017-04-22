package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-22.
 */
public class E10v2 {
    public static void main(String[] args) {
        String phrase = "Java now has regular expressions";
        String[] expressions = {"^Java",
        "\\Breg.*",
        "n.w\\s+h(a|i)s",
                "s?",
                "s*",
                "s+",
                "s{4}",
                "S{1}",
                "s{0,3}"
        };
        for (String arg:expressions
                ) {
            System.out.println("Regular expression: \""+arg+"\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(phrase);
            while (m.find()){
                System.out.println("Match \""+m.group()+"\" at positions "+
                        m.start()+"-"+(m.end()-1));
            }
        }
    }
}
