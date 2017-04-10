package holding;

import java.util.*;

/**
 * Created by Rafal on 02017-03-31.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // !
        Integer[] moreInts = {6,7,8,9,10}; // !
        collection.addAll(Arrays.asList(moreInts)); // !
        Collections.addAll(collection, 11,12,13,14,15); // !
        Collections.addAll(collection, moreInts); // !
        // List "backed" by an array ?!
        List<Integer> list = Arrays.asList(16,17,18,19,20); // !
        list.set(1,99); // !
//        list.add(21); // Throws an exception. Underlying array cannot be resized (where da f is dat array?)
    }
}
