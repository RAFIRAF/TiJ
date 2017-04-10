package reusing;

import java.util.Random;

/**
 * Created by Rafal on 02017-03-01.
 */

public class Cwiczenie18 {
    private static Random random = new Random(47);
    public static final double PI = random.nextDouble()*100;
    private final double x = random.nextDouble()*100;

    public static void main(String[] args) {
        System.out.println("PI = " + PI);
        Cwiczenie18 cw = new Cwiczenie18();
        System.out.println("cw.x = " + cw.x);
        System.out.println("cw.PI = " + cw.PI);
        Cwiczenie18 cw2 = new Cwiczenie18();
        System.out.println("cw2.x = " + cw2.x);
        System.out.println("cw2.PI = " + cw2.PI);
        Cwiczenie18 cw3 = new Cwiczenie18();
        System.out.println("cw3.x = " + cw3.x);
        System.out.println("cw3.PI = " + cw3.PI);
        System.out.println("Zmienna finalna statyczna PI jest inicjalizowana tylko raz przy" +
                " ładowaniu klasy, natomiast zmienna finalna niestatyczna x jest inicjalizowana" +
                " przy tworzeniu każdego nowego obiektu.");
    }
}
