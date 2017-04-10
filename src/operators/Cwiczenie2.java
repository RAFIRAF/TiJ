package operators;

import static net.mindview.util.Print.print;

/**
 * Created by Rafal on 02017-02-20.
 */
class Tank{
    int i;
}
public class Cwiczenie2 {
    public static void main(String[] a){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.i = 13;
        t2.i = 37;
        print("t1.i = " + t1.i + " t2.i = " + t2.i);
        t1=t2;
        print("aliasing t1=t2");
        print("t1.i = " + t1.i + " t2.i = " + t2.i);
        t1.i = 69;
        print("t1.i = " + t1.i + " t2.i = " + t2.i);
    }

}
