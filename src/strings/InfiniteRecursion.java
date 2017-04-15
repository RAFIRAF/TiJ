package strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafal on 02017-04-15.
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return "InfiniteRecursion address: "+this+"\n"; // Here is the infinite recursion.
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
