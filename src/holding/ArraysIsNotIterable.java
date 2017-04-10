package holding;

import java.util.Arrays;

/**
 * Created by Rafal on 02017-04-09.
 */
public class ArraysIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for (T t:ib
             ) {
            System.out.print(t +" ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] strings = {"A","B","C"};
        //arrays works with foreach but it's  not iterable
//        test(strings);
        //although it's possible to conver it to an Iterable
        test(Arrays.asList(strings));
    }
}
