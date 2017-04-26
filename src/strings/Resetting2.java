package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-24.
 */
public class Resetting2 {
    public static void main(String[] args) throws Exception {//!
        Matcher matcher = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (matcher.find())
            System.out.print(matcher.group()+" ");
        System.out.println();
//        matcher.reset();// nic nie zmienia.reset( ) without any arguments
// sets the Matcher to the beginning of the current sequence
        matcher.reset("fix the rig with rags");//teraz dziala
        while (matcher.find())
            System.out.print(matcher.group()+" ");

    }
}
