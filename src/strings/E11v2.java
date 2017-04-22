package strings;

/**
 * Created by Rafal on 02017-04-22.
 */
public class E11v2 {
    public static void main(String[] args) {
        System.out.println("Arline ate eight apples and one orange while Anita hadn’t any".matches("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"));
    }
}
