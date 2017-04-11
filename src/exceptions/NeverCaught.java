package exceptions;

/**
 * Created by Rafal on 02017-04-10.
 */
public class NeverCaught {
    static void f(){throw new RuntimeException("From f()");}
    static void g(){f();}

    public static void main(String[] args) {
        g();
    }
}
