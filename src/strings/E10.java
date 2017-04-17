package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-16.
 */
public class E10 {
    public static void main(String[] args) {
        String source = "Java now has regular expressions";
        String[] regEx = {"^Java","\\Breg.*","n.w\\s+h(a|i)s"};
        System.out.println("Source string: "+source);
        for (String pattern:regEx
             ) {
            System.out.println("Regular expression: \""+pattern+"\"");
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(source);
            while (m.find()){
                System.out.println("Match \""+m.group()+"\" at positions "+m.start()+"-"+
                        (m.end()-1));
            }
        }
    }
}
