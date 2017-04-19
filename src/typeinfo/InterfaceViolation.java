package typeinfo;

import typeinfo.interfacea.A;

/**
 * Created by Rafal on 02017-04-19.
 */
// Obchodzenie interfejsu
class B implements A{
    @Override
    public void f() {

    }
    public void g(){}
}
public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // does not work
        System.out.println(a.getClass().getName());
        if (a instanceof B){
            B b = (B)a;
            b.g();
        }
    }
}
