package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-17.
 */
public class Resetting {
    public static void main(String[] args) throws Exception{
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (m.find())
            System.out.println(m.group() + " ");
        System.out.println();
        m.reset("fix the rig with rags");
        while (m.find())
            System.out.println(m.group()+" ");
    }
}
