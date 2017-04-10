package holding;

import java.util.*;

/**
 * Created by Rafal on 02017-04-10.
 */
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] integers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(integers));
        System.out.println("Before shuffling: " + list1);
        Collections.shuffle(list1, random);
        System.out.println("After shuffling:" + list1);
        System.out.println("array : "+Arrays.toString(integers));
        List<Integer> list2 = Arrays.asList(integers);

        System.out.println("Before shufflng: "+list2);
        Collections.shuffle(list2, random);
        System.out.println("After shuffling"+list2);
        System.out.println("array: "+Arrays.toString(integers));



    }
}
