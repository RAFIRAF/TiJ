package generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Rafal on 02017-04-30.
 */
public class RandomList2<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random random = new Random(47);
    public void add(T item){storage.add(item);}
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList2<String> randomList2 = new RandomList2<>();
        for (String s:("The quick brown fox jumped over the lazy brown dog".split(" "))
             ) {
            randomList2.add(s);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(randomList2.select());
        }
    }
}
