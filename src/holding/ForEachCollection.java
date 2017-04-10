package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Rafal on 02017-04-09.
 */
public class ForEachCollection {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs,"Take the long way home   ".split(" "));
        for (String s :cs
             ) {
            System.out.print("'"+s+"'");
        }
    }
}
