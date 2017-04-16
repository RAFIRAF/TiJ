package net.mindview.util;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-16.
 */
public class E11 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher("Arline ate eight apples and one orange" +
                " while Anita hadn't any");
        while (m.find()){
            System.out.println("Match \""+m.group()+"\" at positions " + m.start() + "-"+
                    (m.end()-1));
        }
    }
}
