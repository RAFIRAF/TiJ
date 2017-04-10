package holding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Rafal on 02017-04-07.
 */
public class E14 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        ListIterator<Integer> listIterator = integers.listIterator();
        for (int i = 0; i < 10; i++) {
            listIterator.add(i);
            if (i%2==0)listIterator.previous();
        }
        System.out.println(integers);
    }
}
