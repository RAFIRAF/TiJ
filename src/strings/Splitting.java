package strings;

import java.util.Arrays;

/**
 * Created by Rafal on 02017-04-16.
 */
public class Splitting {
    public static String knights  = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W  +"); //nonword characters
        split("n\\W+"); // n followed by nonword characters
    }
}
