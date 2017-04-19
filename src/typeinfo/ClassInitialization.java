package typeinfo;

import java.util.Random;

/**
 * Created by Rafal on 02017-04-18.
 */
class Initable{
    static final int staticFinal = 47;
    static final int staticFinal1 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
class Initable2{
    static int staticNotFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}
class Initable3{
    static int staticNotFinal = 74;
    static {
        System.out.printf("Initializing Initable3");
    }
}
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        // Does not trigger initialization:
        System.out.println(Initable.staticFinal);
        // But this does:
        System.out.println(Initable.staticFinal1);
        // So does this:
        System.out.println(Initable2.staticNotFinal);
        Class initable3 = Class.forName("typeinfo.Initable3");
        System.out.println("After creating Initabl3 ref");
        System.out.println(Initable3.staticNotFinal);

    }
}
