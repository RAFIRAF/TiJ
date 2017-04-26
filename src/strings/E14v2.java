package strings;

import java.util.Arrays;

/**
 * Created by Rafal on 02017-04-24.
 */
public class E14v2 extends _REPEAT_SplitDemo2 {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(input);
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!",3)));

    }
}
