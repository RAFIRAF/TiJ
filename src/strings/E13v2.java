package strings;

/**
 * Created by Rafal on 02017-04-24.
 */
public class E13v2 extends _Repeat_StartEnd2 {
    public static void main(String[] args) {
        for (String in :Groups2.POEM.split("\n")
             ) {
            System.out.println("input: "+in);
            for (String regex: new String[]{"\\b\\w+s\\b",
                    "\\b\\w+e\\b"}
                 ) {
                examine(in, regex);
            }
        }
    }
}
