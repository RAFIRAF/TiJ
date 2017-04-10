package holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Rafal on 02017-03-31.
 */
public class SimpleCollection{
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i); // AUTOBOXING == from primitive to object
        }
        for (Integer i : c
             ) {
            System.out.print(i + ", ");
        }
    }
}
