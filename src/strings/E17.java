package strings;

import net.mindview.util.TextFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//1line comment
public class E17 {
    public static void main(String[] args) {
        if (args.length<1){
            System.err.println("No file specified to search for comments");
            System.exit(-1);
        }
        String s = TextFile.read(args[0]);
        Pattern pattern = Pattern.compile("/\\*.*?\\*/", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
            System.out.println(matcher.group());
        matcher.reset();
        Matcher matcher1 = Pattern.compile("//.*").matcher("");
        for (String line:new TextFile(args[0])
             ) {
            matcher1.reset(line);
            while (matcher1.find())
                System.out.println(matcher1.group());
        }
        /* komentarz
            spanning across multiple lines
         */
    }
}
