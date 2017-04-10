package holding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

/**
 * Created by Rafal on 02017-04-08.
 */
public class E18 {
    private static void fill(HashMap<Integer,Integer> hashMap){
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = hashMap.get(r);
            hashMap.put(r,freq==null ? 1 : freq+1);
        }

    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        fill(hashMap);
        System.out.println(hashMap);
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap);

    }
}
