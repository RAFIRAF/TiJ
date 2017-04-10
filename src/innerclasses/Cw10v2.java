package innerclasses;

/**
 * Created by Rafal on 02017-03-21.
 */
interface SimpleInterface{
    void f();
}
public class Cw10v2 {
    public SimpleInterface get(){
        {
            class SI implements SimpleInterface {
                public void f() {
                    System.out.println("SI.f");
                }
            }
            return new SI();
        }
    }

    public static void main(String[] args) {
        SimpleInterface simpleInterface = new Cw10v2().get();
        simpleInterface.f();
    }
}
