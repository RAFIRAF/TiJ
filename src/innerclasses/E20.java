package innerclasses;

/**
 * Created by Rafal on 02017-03-25.
 */
public interface E20 {
    void f();
    class InnerE20 implements E20{
        @Override
        public void f() {
            System.out.println("E20.f()");
        }

        public static void main(String[] args) {
            InnerE20 innerE20 = new InnerE20();
            innerE20.f();
        }
    }
}
class E20I implements E20{
    @Override
    public void f() {
        System.out.println("E20I.f()");
    }

    public static void main(String[] args) {
        InnerE20.main(args);
        new E20I().f();
    }
}
