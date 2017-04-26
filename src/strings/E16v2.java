package strings;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-25.
 */
public class E16v2 extends _REPEAT_E15_JGrep2 {
    public static void main(String[] args) {
        if (args.length<3){
            System.out.println("Usage: java _REPEAT_E15_JGrep2 file/directory regex flag");
            System.out.println("Available flags: CANON_EQ, CASE_INSENSITIVE, COMMENTS," +
                    "DOTALL, MULTILINE, UNICODE_CASE, UNIX_LINES");
            System.exit(1);
        }
        int flag = 0; // flag appears to be an int
        if (args[2].equalsIgnoreCase("CASE_INSENSITIVE")){ // eq ignore case
            flag = Pattern.CASE_INSENSITIVE;
        }else if (args[2].equalsIgnoreCase("COMMENTS")){
            flag = Pattern.COMMENTS;
        }else if (args[2].equalsIgnoreCase("DOTALL")){
            flag = Pattern.DOTALL;
        }else if (args[2].equalsIgnoreCase("MULTILINE")){
            flag = Pattern.MULTILINE;
        }else if (args[2].equalsIgnoreCase("UNICODE_CASE")){
            flag = Pattern.UNICODE_CASE;
        }else if (args[2].equalsIgnoreCase("UNIX_LINES")){
            flag = Pattern.UNIX_LINES;
        }
        Pattern pattern = Pattern.compile(args[1], flag); //! + flag arg
        int index = 0 ;
        Matcher matcher = pattern.matcher("");
        boolean isFile = new File(args[0]).isFile();
        if (isFile){
            for (String line :new TextFile(args[0])
                    ) {
                matcher.reset(line);
                while (matcher.find())
                    System.out.println(index++ +": "+
                            matcher.group()+": "+matcher.start());
            }
        }else {
            File[] files = new File(args[0]).listFiles();
            for (File file:files
                 ) {
                System.out.println("\nScanning file "+file);
                for (String line :new TextFile(file.getAbsolutePath())
                        ) {
                    matcher.reset(line);
                    while (matcher.find())
                        System.out.println(index++ +": "+
                                matcher.group()+": "+matcher.start());
                }
            }
        }


    }
}
