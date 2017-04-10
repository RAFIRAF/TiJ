package operators;

/**
 * Created by Rafal on 02017-02-21.
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = i;
        long lng2 = (long)i;
        lng = i;
        long lng3 = (long)200;
        lng2 = 200;
        i = (int)(long)i;
    }
}
