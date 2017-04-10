package operators;

/**
 * Created by Rafal on 02017-02-21.
 */
public class Cwiczenie9 {
    public static void main(String[] args) {
        System.out.printf("Float.MAX_VALUE = %e.\n", Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.printf("Double.MAX_VALUE = %e.\n", Double.MAX_VALUE);
        System.out.println(Math.getExponent(Float.MAX_VALUE));
        float f = 0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000003402823e127f;
        System.out.println(f);
    }
}
