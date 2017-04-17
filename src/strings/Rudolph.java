package strings;

/**
 * Created by Rafal on 02017-04-16.
 */
public class Rudolph {
    public static void main(String[] args) {
        for (String pattern:new String[] {"Rudolph","[rR]udolph","[rR][aeiou][a-z].*","R.*"}
             ) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
