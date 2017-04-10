package innerclasses;

/**
 * Created by Rafal on 02017-03-22.
 */
public class E10v2 {
    public PubiInti get(){
//        {
            class SI implements PubiInti{
                @Override
                public void f() {
                    System.out.println("SI.f()");
                }
            }
            return new SI();
//        }
    }

    public static void main(String[] args) {
        PubiInti si = new E10v2().get();
        si.f();
    }
}
