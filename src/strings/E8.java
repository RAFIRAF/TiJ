package strings;

import java.util.Arrays;

/**
 * Created by Rafal on 02017-04-21.
 */
public class E8 {
    private static String poem = "Then, when you have found the shrubbery, you must " + // shrubbery == zarośla/krzewy
            "cut down the mightiest tree in the forest... " +
            "with... a herring!"; // śledź
    private static String testRegEx(String regex){
        return Arrays.toString(poem.split(regex));
    }

    public static void main(String[] args) {
        System.out.println(testRegEx(" the | you "));
    }
}
