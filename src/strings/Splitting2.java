package strings;

import java.util.Arrays;

/**
 * Created by Rafal on 02017-04-20.
 */
public class Splitting2 {
    public static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+"); //non-word characters
        split("n\\W+"); // n followed by non-word characters
    }
}
