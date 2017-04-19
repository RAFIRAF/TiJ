package typeinfo;

/**
 * Created by Rafal on 02017-04-18.
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;

    }
}
