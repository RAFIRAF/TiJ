package innerclasses.exxx6;

import innerclasses.ex6.A;
import innerclasses.exx6.B;

/**
 * Created by Rafal on 02017-03-21.
 */
public class D extends B {
    public A method(){
        return new C();
        }
    public static void main(String[] args) {
        new D().method().methodA();
    }
}