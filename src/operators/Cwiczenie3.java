package operators;

import static net.mindview.util.Print.printf;

/**
 * Created by Rafal on 02017-02-20.
 */
class Hm{
    float f;
}
public class Cwiczenie3 {
    public static void f(Hm hm){
        hm.f = 13.37f;
    }
    public static void main(String[] args) {
        Hm hm = new Hm();
        printf("hm.f = %ff\n",hm.f);
        hm.f = 69;
        f(hm);
        printf("aliasing, hm.f = %ff\n",hm.f);
    }
}
