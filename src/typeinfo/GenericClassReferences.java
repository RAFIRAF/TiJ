package typeinfo;

/**
 * Created by Rafal on 02017-04-18.
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // the same thing
        intClass = double.class; // dozwolone
//        genericIntClass = double.class // niedozwolone
        System.out.println(intClass);
        System.out.println(genericIntClass);
    }
}
