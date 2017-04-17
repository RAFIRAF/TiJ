package strings;

import strings.Splitting;

/**
 * Created by Rafal on 02017-04-16.
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+","located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
    }
}
