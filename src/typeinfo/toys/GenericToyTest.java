package typeinfo.toys;

/**
 * Created by Rafal on 02017-04-18.
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> fancyToyClass = FancyToy.class;
        FancyToy fancyToy = fancyToyClass.newInstance();
        Class<? super FancyToy> up = fancyToyClass.getSuperclass();

    }
}
