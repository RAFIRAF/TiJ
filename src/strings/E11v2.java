package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-22.
 */
public class E11v2 {
    public static void main(String[] args) {
        String source = "Arline ate eight apples and one orange while Anita hadn’t any";
        Pattern pattern = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+[aeiou]\\b");
        Pattern pattern2 = Pattern.compile("([AEOUI]|(\\b[AEOUIaeoui]))\\w+[aeoui]\\b");
        Matcher matcher = pattern.matcher(source);
        Matcher matcher2 = pattern2.matcher(source);
//        System.out.println(matcher.matches());
        while (matcher.find()){
            System.out.println("Match "+matcher.group()+" at positions "+ matcher.start()+
            "-"+ matcher.end());
        }
        while (matcher2.find()){
            System.out.println("Match2 "+matcher2.group()+" at positions "+ matcher2.start()+
                    "-"+ matcher2.end());
        }
    }
}
