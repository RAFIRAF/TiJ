package typeinfo;

/**
 * Created by Rafal on 02017-04-18.
 */
public class WildcardReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
