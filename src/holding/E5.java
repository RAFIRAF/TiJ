package holding;

/**
 * Created by Rafal on 02017-04-06.
 */

import typeinfo.pets.*;

import java.util.*;


/**
 * Created by Rafal on 02017-04-04.
 */

class ListFeaturesWithIntegers {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> integers = new ArrayList<>(Arrays.asList(14,1,7,4,123,43,6,8,3,0));
        System.out.println("1: " + integers);
        Integer i = 331;
        int j = i;
        integers.add(i); // automatic re-size
        System.out.println("2: " + integers);
        System.out.println("3 : " + integers.contains(i)); // !
//        integers.remove(j); // ERROR
        integers.remove(i);
        Integer p = integers.get(2);
        System.out.println("4: " + p + " " + integers.indexOf(p)); // !
        Integer cymric = 66;
        System.out.println("5: " + integers.indexOf(cymric)); // - 1
        System.out.println("6: " + integers.remove(cymric)); // false. gdyby cymric byl primitive to errror
        System.out.println("7: " + integers.remove(p)); // true. gdy primitive to  0
        System.out.println("8: " + integers);
        integers.add(3, 2222);
        System.out.println("9: " + integers);
        List<Integer> sub = integers.subList(1, 4); // !
        System.out.println("sublist: " + sub); // [1,4) --- sub contains 3 elements only
        System.out.println("10: " + integers.containsAll(sub)); // !
        Collections.sort(sub); // IN-PLACE sort
        System.out.println("sorted list: "+sub);
        System.out.println("11: " + integers.containsAll(sub)); // order unimportnt in containsAll
        Collections.shuffle(sub,rand);
        System.out.println("shuffled sublist: " +sub); // !
        System.out.println("12: " + integers.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1),integers.get(4)); // !
        System.out.println("sub = " + sub);
        copy.retainAll(sub); // zostaje tylko to co w sub
        System.out.println("13: "+copy);
        copy = new ArrayList<>(integers);
        copy.remove(2);
        System.out.println("14: "+copy);
        copy.removeAll(sub); // usuwa pierwsze wystapienia danych elementow
        System.out.println("15: "+copy);
        copy.set(1, 1111); // !
        System.out.println("16: "+copy);
        copy.addAll(2, sub); // insert list in middle
        System.out.println("17: "+copy);
        System.out.println("18: "+integers.isEmpty()); // !
        integers.clear();
        System.out.println("19: "+integers);
        System.out.println("20: "+integers.isEmpty());
        integers.addAll(Arrays.asList(5,55,22,11));
        System.out.println("21: "+integers);
        Object[] o = integers.toArray();
        System.out.println("22: " + o[3]);
        Integer[] pa = integers.toArray(new Integer[0]); //???????????????
        System.out.println("23: " +Arrays.toString(pa));
//        System.out.println("24: "+Arrays.toString(pa));
    }
}

public class E5 {
    public static void main(String[] args) {
        ListFeaturesWithIntegers.main(args);
    }
}
