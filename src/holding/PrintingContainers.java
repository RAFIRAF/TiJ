package holding;

import java.util.*;

import static net.mindview.util.Print.*;

/**
 * Created by Rafal on 02017-03-31.
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        Collections.addAll(collection, "dog");
        return collection;
    }
    static Map fill(Map<String, String> map){
        map.put("rat", "Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }

    public static void main(String[] args) {
        // Genialne:
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>())); // Można zrobić sort na podstawie tego
        print(fill(new LinkedHashSet<String>()));

        print(fill(new HashMap<String, String>()));
        print(fill(new TreeMap<String, String>()));
        print(fill(new LinkedHashMap<String, String>()));
    }
}
