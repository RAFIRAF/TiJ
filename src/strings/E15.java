package strings;

import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-17.
 */
public class E15 {
    public static void main(String[] args) {
        if (args.length<3){
            System.out.println("Usage: E15 file regex pattern");
            System.out.println("pattern can take of of the following values:");
            System.out.println("CANON_EQ, CASE_INSENSITIVE, COMMENTS, " +
                    "DOTALL, MULTILINE, UNICODE_CASE, UNIX_LINES");
            System.exit(0);
        }
        int flag = 0 ;
        if (args[2].equalsIgnoreCase("CASE_INSENSITIVE"))
            flag = Pattern.CASE_INSENSITIVE;
//        else if
    }
}
