package holding;

import net.mindview.util.Generator;

import java.util.*;

/**
 * Created by Rafal on 02017-04-04.
 */
class MovieNameGenerator implements Generator<String> {
    private String[] characters = {
            "Grumpy", "Happy", "Sleepy", "Dopey", "Doc","Sneezy",
            "Bashful","Snow White", "Witch Queen", "Prince"
    };
    private int next;
    public String next(){
        String r = characters[next];
        next = (next + 1 ) % characters.length; // zapewnia, ze next zawsze bedzie z przedzialu
        return r;                               // [0,characters.length-1]
    }
}
public class E04_MovieNameGenerator{
    private static final MovieNameGenerator mng = new MovieNameGenerator(); // static final
    static String[] fill(String[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = mng.next();
        }
        return array;
    }
    static Collection<String> fill (Collection<String> collection){
        for (int i = 0; i < 5; i++) {
            collection.add(mng.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}
