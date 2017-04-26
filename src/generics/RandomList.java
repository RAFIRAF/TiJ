package generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Rafal on 02017-04-26.
 */
public class RandomList<T> {
    private ArrayList<T> storage  = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item){storage.add(item);}
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();

    }
}
