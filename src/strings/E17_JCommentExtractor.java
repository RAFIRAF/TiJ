package strings;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-26.
 */
public class E17_JCommentExtractor {
    public static final String CMNT_EXT_REGEX = // !!!!!!!! :O + final
            "(?x)(?m)(?s) # Comments, Multiline & Dotall: ON\n"+ // Why multiline?
                                                                 // Comments? U mean these?: #
                                                                 // Why do they hurt?
            "/\\*         # Match START OF THE COMMENT\n"+
            "(.*?)        # Match all chars\n"+ // Jak dokładnie działa "?". Uwaga na nawias
            "\\*/         # Match END OF THE COMMENT\n"+
            "| //(.*?)$   # OR Match C++ style comments"; // Jest $. Jak dokładnie działa "?"
                                                          // Czy spacja przed // ma jakieś znaczenie
    public static void main(String[] args)throws Exception {
        if (args.length<1){
            System.out.println("Usage: java E17_JCommentExtractor file"); // out, not err
            System.exit(0); // 0, not 1/-1
        }
        String src = TextFile.read(args[0]);
        Pattern p = Pattern.compile(CMNT_EXT_REGEX);
        Matcher m = p.matcher(src);
        while (m.find())
            System.out.println(m.group(1) != null ? m.group(1) : m.group(2)); // ! grupy? !
                                                                               // ternary w sout
    }
}
