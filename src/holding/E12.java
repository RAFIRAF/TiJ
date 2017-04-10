package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static java.util.Collections.reverse;

/**
 * Created by Rafal on 02017-04-07.
 */
public class E12 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> integers1 = new ArrayList<>(integers.size());
        ListIterator<Integer> listIterator = integers.listIterator(integers.size());
//        while (listIterator.hasNext()){
//            listIterator.next();
//        }
        while (listIterator.hasPrevious()){
//            listIterator.previous();
//            Integer current = ;
            integers1.add(listIterator.previous());
        }
        System.out.println(integers);
        System.out.println(integers1);
        reverse(integers1);
        System.out.println(integers1);
    }
}
