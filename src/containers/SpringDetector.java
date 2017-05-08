package containers;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rafal on 02017-05-07.
 */
public class SpringDetector {
    public static <T extends Groundhog>
    void detectSpring(Class<T> type)throws Exception{
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i),new Prediction());
        }
        System.out.println("map = "+map);
        Groundhog groundhog = ghog.newInstance(3);
        System.out.println("Looking up prediction for "+groundhog);
        if (map.containsKey(groundhog))
            System.out.println(map.get(groundhog));
        else
            System.out.println("Key not found: "+groundhog);
    }

    public static void main(String[] args)throws Exception {
        detectSpring(Groundhog.class);

    }
}
