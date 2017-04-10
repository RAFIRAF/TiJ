package holding;

import java.util.*;
import java.util.Iterator;

/**
 * Created by Rafal on 02017-04-10.
 */
class ReversibleArrayList<T> extends ArrayList<T> {
    ReversibleArrayList(Collection<T> c){super(c);}
    Iterable<T> reversed(){
        return () -> new Iterator<T>() {
            int current = size() - 1;
            @Override
            public boolean hasNext() {
                return current > -1;
            }
            @Override
            public T next() {
                return get(current--);
            }
        };
    }
}
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s: ral
             ) {
            System.out.print(s+" ");
        }
        System.out.println();
        //hand in iterable of your choice?????
        for (String s : ral.reversed()
             ) {
            System.out.print(s+" ");
        }
    }
}
