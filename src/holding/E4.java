package holding;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Rafal on 02017-03-31.
 */
interface Iterator{
    boolean end();
    void next();
    Object current();
}
class NameGenerator{
    private ArrayList<String> names = new ArrayList<>();
    private int i;
    NameGenerator(){
        names.add("Goku");
        names.add("Bulma");
        names.add("Tenshin");
        names.add("Krilan");
        names.add("Piccolo");
        names.add("Mr Satan");
        names.add("Cell");
        names.add("Buu");
        names.add("Gohan");
        names.add("Vegeta");
        names.add("Goten");
        names.add("Pan");
        names.add("Trunks");
    }
    private class NamesSelector implements Iterator{
        private  int i = 0 ;
        private void resetCounter(){i=0;}
        public boolean end(){ return names.size()==i+1;}
        public String current(){return names.get(i);}
        public void next(){if (end()){resetCounter();} else i++;}
    }
    private NamesSelector namesSelector = new NamesSelector();
    public String next(){
        String current = namesSelector.current();
        namesSelector.next();
        return current;
    }

}
public class E4 {
    private static Collection<String> fill(Collection<String> collection){
        NameGenerator nameGenerator = new NameGenerator();
        for (int i = 0; i < 15; i++) {
            collection.add(nameGenerator.next());
        }
        return collection;
    }
    public static void main(String[] args) {
        Collection arrayList = fill(new ArrayList<>());
        Collection linkedList = fill(new LinkedList<>());
        Collection hashSet = fill(new HashSet<>());
        Collection treeSet = fill(new TreeSet<>());
        Collection linkedHashSet = fill(new LinkedHashSet<>());
        System.out.println(arrayList+" ArrayList size "+arrayList.size());
        System.out.println(linkedList+" LinkedList size "+linkedList.size());
        System.out.println(hashSet+" HashSet size "+hashSet.size());
        System.out.println(treeSet+" TreeSet size "+treeSet.size());
        System.out.println(linkedHashSet+" LinkedHashSet size "+linkedHashSet.size());
    }
}
