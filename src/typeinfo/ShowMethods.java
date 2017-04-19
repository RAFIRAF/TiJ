package typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by Rafal on 02017-04-18.
 */
public class ShowMethods {
    private static String usage =
            "usage:\n" +
                    "ShowMethods qualified.class.name\n"+
                    "To show all methods in class or:\n"+
                    "ShowMethods qualified.class.name word\n"+
                    "To search for methods involving word";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length<1){
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            if (args.length==1){
                for (Method m :methods
                     ) {
                    System.out.println(p.matcher(m.toString()).replaceAll(""));
                }
                for (Constructor cons:constructors
                     ) {
                    System.out.println(p.matcher(cons.toString()).replaceAll(""));
                }
                lines = methods.length+constructors.length;
            }else {
                for (Method m : methods
                        ) {
                    if (m.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(m.toString()).replaceAll(""));
                    }
                }
                for (Constructor cc : constructors) {
                    if (c.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(cc.toString()).replaceAll(""));
                    }
                }
            }
        }catch (ClassNotFoundException e){
            System.out.println("No such class: " + e);
        }
    }
}
